package VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Pear", 20));
        vm.addProduct(new Product("Lemon", 30));
        vm.addProduct(new Drink("FromCow", 40, 0.5, TypesOfDrink.MILK));
        vm.addProduct(new Chocolate("Red October", 40, 50));

        System.out.println(vm);

    }
}
