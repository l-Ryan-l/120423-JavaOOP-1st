public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", name, price);
    }
}
