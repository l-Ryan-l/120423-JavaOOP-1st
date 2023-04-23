public class Task2 {
    public static void main(String[] args) {
        CoffeeMachine coffMach = new CoffeeMachine();
        coffMach.addProduct(new Product("Latte S", 110, 100, 70.6))
                .addProduct(new Product("Latte M", 120, 150, 70.3))
                .addProduct(new Product("Latte L", 130, 200, 70.8))
                .addProduct(new Product("Americano", 70, 30, 90.2))
                .addProduct(new Product("Cappuccino S", 115, 100, 75.1))
                .addProduct(new Product("Cappuccino M", 125, 150, 75.4))
                .addProduct(new Product("Cappuccino L", 135, 200, 75.9))
                .addProduct(new Product("Hot Chocolate", 120, 150, 70));

        System.out.println("Available drinks: ");
        for (int i = 0; i < coffMach.getList().size(); i++) {
            System.out.println(coffMach.getList().get(i));
        }

        System.out.println("\nPurchase in progress...");
        System.out.println(coffMach.sellProduct(coffMach.findProduct("Cappuccino M")) + " - Sold");
        System.out.println("Money in the machine: " + coffMach.getAmountOfMoney() + "rub");
        System.out.println("\nAvailable products: ");
        for (int i = 0; i < coffMach.getList().size(); i++) {
            System.out.println(coffMach.getList().get(i));
        }

        System.out.println("\nPurchase in progress...");
        System.out.println(coffMach.sellProduct(coffMach.findProduct("Latte L")) + " - Sold");
        System.out.println("Money in the machine: " + coffMach.getAmountOfMoney() + "rub");
        System.out.println("\nAvailable products: ");
        for (int i = 0; i < coffMach.getList().size(); i++) {
            System.out.println(coffMach.getList().get(i));
        }

        // Попытка купить товар, который отсутствует
        // System.out.println(coffMach.sellProduct(coffMach.findProduct("Cappuccino M")) + " - Sold");
    }
}
