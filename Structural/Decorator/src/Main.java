//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IPizza pizzaPepperoni = new PizzaPepperoni();

        System.out.println(pizzaPepperoni.description());
        System.out.println(pizzaPepperoni.price());

        IPizza pizzaHawaiana = new PizzaHawaiana();

        System.out.println(pizzaHawaiana.description());
        System.out.println(pizzaHawaiana.price());

        // extra cheese -> precio + 2
        // orilla rellena de queso -> precio + 4
        // se puede hacer con herencia, pero tambien con decorator
        // entonces, con decorator seria asi :
        IPizza pizzaPepperoniQuesoExtra = new ExtraCheese(new PizzaPepperoni());
        System.out.println(pizzaPepperoniQuesoExtra.description());
        System.out.println(pizzaPepperoniQuesoExtra.price());

        IPizza pizzaPepperoniRellena = new StuffedCrustPizza(new PizzaPepperoni());
        System.out.println(pizzaPepperoniRellena.description());
        System.out.println(pizzaPepperoniRellena.price());

        IPizza pizzaPepperoniRellenaYQuesoExtra = new ExtraCheese(new StuffedCrustPizza(new PizzaPepperoni()));
        System.out.println(pizzaPepperoniRellenaYQuesoExtra.description());
        System.out.println(pizzaPepperoniRellenaYQuesoExtra.price());
    }
}