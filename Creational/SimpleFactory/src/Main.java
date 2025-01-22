//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //This does not follow a creation pattern
        Pizza pepperoniPizza = new Pizza(8);

        //With SimpleFactory
        Pizzeria pizzeriaDC = new Pizzeria();
        Pizza smallPizza = pizzeriaDC.createSPizza();
        Pizza mediumPizza = pizzeriaDC.createMPizza();
        Pizza bigPizza = pizzeriaDC.createXLPizza();
        System.out.println(pepperoniPizza);
        System.out.println(smallPizza);
        System.out.println(mediumPizza);
        System.out.println(bigPizza);
    }
}