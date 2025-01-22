//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // fruit 15% discount
        // white goods 5% discount

        Apple apple = new Apple();
        WashingMachine washingMachine = new WashingMachine();

        IVisitor discount = new CommonDiscount();

        System.out.println(apple.applyDiscount(discount));
        System.out.println(washingMachine.applyDiscount(discount));
    }
}