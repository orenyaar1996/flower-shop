public class Order {
    private String name;
    private String city;
    private Item item;

    public Order(String name, String city, Item item) {
        this.name = name;
        this.city = city;
        this.item = item;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public Item getItem() {
        return this.item;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Order Name: " + name + ", City: " + city + ", " + item.toString();

    }
}
