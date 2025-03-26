import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;

public class Store {
    Queue<Order> orders; // Queue of orders
    Map<String, Queue<Order>> ordersByCity; // key: city name, value: queue of orders
    int deliverySize;

    public Store(int deliverySize) {
        this.orders = new LinkedList<>();
        this.ordersByCity = new HashMap<>();
        this.deliverySize = deliverySize;
    }

    public void addOrder(Order order) {
        String city = order.getCity();

        if (!ordersByCity.containsKey(city)) {
            Queue<Order> cityOrders = new LinkedList<>();
            ordersByCity.put(city, cityOrders); // add city to the map
        }
        ordersByCity.get(city).add(order); // add order to the city
        orders.add(order); // add order to the queue
    }

    public void createDelivery() {
        int counter = 0;
        while (counter < this.deliverySize) {
            if (orders.isEmpty()) {
                System.out.println("No orders to deliver");
                return;
            }
            Order order = orders.poll();
            String city = order.getCity(); // get the city name from the queue
            System.out.println("Delivering order to " + city + " : " + order.toString());

            ordersByCity.get(city).poll(); // poll order from city queue
            counter++;

            while (!ordersByCity.get(city).isEmpty() && counter < this.deliverySize) { // deliver orders from same city
                order = ordersByCity.get(city).poll(); // get the next order from the same city
                System.out.println("Delivering order to " + city + " : " + order.toString());
                counter++;
                removeOrderFromQueue(order);
            }
        }
    }

    private void removeOrderFromQueue(Order orderToRemove) {
        if (orders.isEmpty()) {
            System.out.println("Order not found in queue");
            return;
        }
        for (Order order : orders) {
            if (order.equals(orderToRemove)) { // if order found - remove from order queue
                orders.remove(orderToRemove);
                return;
            }
        }
    }

    public void printOrders() {
        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }
}