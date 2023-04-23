public class Juice extends Product {
    private final double volume;

    public Juice(String name, int price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {

        return String.format("%s, %s",super.toString(), volume + "L");
    }
}
