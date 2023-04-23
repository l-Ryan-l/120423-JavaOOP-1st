public class ChocolateBar extends Product{
    private final String chocolateType;
    public ChocolateBar(String name, int price, String chocolateType) {
        super(name, price);
        this.chocolateType = chocolateType;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), chocolateType);
    }
}
