public class Plant extends Item {
    private Boolean withFlowerPot;

    public Plant(String name, Boolean withFlowerPot) {
        super(name);
        this.withFlowerPot = withFlowerPot;
        setPrice();

    }

    public Boolean getWithFlowerPot() {
        return withFlowerPot;

    }

    private void setPrice() {
        if (this.withFlowerPot) {
            super.setPrice(120);
        }
        super.setPrice(80);
    }

    public void setWithFlowerPot(Boolean withFlowerPot) {
        this.withFlowerPot = withFlowerPot;
        setPrice();
    }

    @Override
    public String toString() {
        return super.toString() + ", Flower Pot: " + withFlowerPot;
    }

}
