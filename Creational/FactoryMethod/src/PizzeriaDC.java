public class PizzeriaDC implements IPizzeria{
    @Override
    public Pizza createPizza(PizzaType type) {
        return switch (type.getPizzaName()) {
            case "Pepperoni" -> new Pizza(8, "Pepperoni");
            case "Hawaiian" -> new Pizza(8, "Hawaiian");
            case "Pepperoni with Stuffed Crust" -> new PizzaWithStuffedCrust(12, "Pepperoni");
            default -> null;
        };

    }
}
