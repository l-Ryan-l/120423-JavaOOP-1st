public class Yogurt extends Product {
    private String flavor;

    public Yogurt(String name, int price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + flavor;
    }
}
