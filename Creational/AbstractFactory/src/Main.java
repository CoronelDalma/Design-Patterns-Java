import Products.IComputer;
import Products.ITablet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Factories
        AppleStore apple = new AppleStore();
        SamsungStore samsung = new SamsungStore();

        //Products
        IComputer appleComputer = apple.createComputer();
        ITablet appleTablet = apple.createTablet();
        IComputer samsungComputer = samsung.createComputer();
        ITablet samsungTablet = samsung.createTablet();

    }
}