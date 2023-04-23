import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> list = new ArrayList<>();
    private int amount = 0;

    public int getAmount() {
        return amount;
    }

    public VendingMachine addProduct(Product product) {
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
            Product prodSold = findProduct(product.getName());
            getList().remove(prodSold);
            amount += prodSold.getPrice();
            return prodSold;

        }
        catch (Exception e) {
            throw new RuntimeException("\nProduct is not found");
        }

    }

}
