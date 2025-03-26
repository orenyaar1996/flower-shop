public class Flower extends Item {
    private String color;

    public Flower(String name, String color) {
        super(name);
        super.setPrice(180);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}
