public class Product {

    private String name;
    private int price;
    private int volume;
    private double temperature;

    public Product(String name, int price, int volume, double temperature) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", name, price + "rub", volume + "ml", temperature + "C");
    }
}
