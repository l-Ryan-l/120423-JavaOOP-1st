public class Task1 {
    public static void main(String[] args) {
        VendingMachine vendMachine = new VendingMachine();
        vendMachine.addProduct(new Product("cheese", 350))
                .addProduct(new Product("wine", 450))
                .addProduct(new Product("milk", 65))
                .addProduct(new Yogurt("Danone", 25, "Strawberry"))
                .addProduct(new Juice("Ya", 70, 1.5))
                .addProduct(new ChocolateBar("Snickers", 45, "milk chocolate"));


        System.out.println("Available goods: ");
        for (int i = 0; i < vendMachine.getList().size(); i++) {
            System.out.println(vendMachine.getList().get(i));
        }

        Product found = vendMachine.findProduct("Ya");
        System.out.println("\nProduct by your search: " + found);
        Product sold = vendMachine.sellProduct(found);
        System.out.println("\n" + sold + " - sold");
        System.out.println("Money in the machine: " + vendMachine.getAmount());

        System.out.println("\nAvailable products: ");
        for (int i = 0; i < vendMachine.getList().size(); i++) {
            System.out.println(vendMachine.getList().get(i));
        }

        System.out.println("\n" + vendMachine.sellProduct(vendMachine.findProduct("wine")) + " - sold");
        System.out.println("Money in the machine: " + vendMachine.getAmount());
        System.out.println("\nAvailable products: ");
        for (int i = 0; i < vendMachine.getList().size(); i++) {
            System.out.println(vendMachine.getList().get(i));
        }
        // вызвать эксепшн
        //System.out.println("\n" + vendMachine.sellProduct(vendMachine.findProduct("wine")) + " - sold");

        // красивый вывод экспешена
        try {
            System.out.println("\n" + vendMachine.sellProduct(vendMachine.findProduct("wine")) + " - sold");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
