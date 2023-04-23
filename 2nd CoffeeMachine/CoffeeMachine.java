import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    List<Product> list = new ArrayList<>();

    private int amountOfMoney = 0;

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public CoffeeMachine addProduct(Product product) {
        list.add(product);
        return this;
    }

    public List<Product> getList() {
        return list;
    }

    public Product findProduct(String someName) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(someName)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public Product sellProduct(Product product) {
        try {
            Product productToSell = findProduct(product.getName());
            getList().remove(productToSell);
            amountOfMoney += productToSell.getPrice();
            return productToSell;
        } catch (Exception e) {
            throw new RuntimeException("\nProduct out of stock");
        }
    }
}