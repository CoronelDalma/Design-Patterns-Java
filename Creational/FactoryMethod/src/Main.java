//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PizzeriaDC pizzeria = new PizzeriaDC();

        Pizza pepperoni = pizzeria.createPizza(PizzaType.PEPPERONI);
        Pizza hawaiian = pizzeria.createPizza(PizzaType.HAWAIIAN);
        Pizza stuffedCrust = pizzeria.createPizza(PizzaType.PEPPERONI_WITH_STUFFED_CRUST);

        System.out.println(pepperoni);
        System.out.println(hawaiian);
        System.out.println(stuffedCrust);
    }
}