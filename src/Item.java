public abstract class Item {
    private String name;
    private int price;

    public Item(String name) {
        this.name = name;
        this.price = 0; // todo
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Item Name: " + name + ", Price: " + price;
    }
}
