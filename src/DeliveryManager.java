import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DeliveryManager {
    public static void main(String[] args) {
        Store store = new Store(3);
        Order order1 = new Order("Oren", "tlv", new Flower("Rose", "Red"));
        Order order2 = new Order("David", "jerusalem", new Plant("Cactus", false));
        Order order3 = new Order("Yael", "tlv", new Flower("Tulip", "Yellow"));
        Order order4 = new Order("Ofri", "tlv", new Flower("Rose", "Red"));
        Order order5 = new Order("Neta", "rehovot", new Plant("Cactus", true));
        Order order6 = new Order("Tamar", "tlv", new Flower("Rose", "Red"));
        Order order7 = new Order("Ziv", "ranana", new Flower("Tulip", "Yellow"));

        // Add orders to the store
        store.addOrder(order1);
        store.addOrder(order2);
        store.addOrder(order3);
        store.addOrder(order4);
        store.addOrder(order5);
        store.addOrder(order6);
        store.addOrder(order7);

        // Print orders
        store.printOrders();

        // Schedule delivery creation
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Creating delivery...");
            store.createDelivery();
        }, 0, 10, TimeUnit.SECONDS);
    }
}
