public enum PizzaType {
    PEPPERONI("Pepperoni"),
    HAWAIIAN("Hawaiian"),
    PEPPERONI_WITH_STUFFED_CRUST("Pepperoni with Stuffed Crust");

    private final String pizzaName;

    PizzaType(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }
}
