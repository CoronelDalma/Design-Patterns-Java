public class StuffedCrustPizza implements IPizza{
    private IPizza pizza;

    public StuffedCrustPizza(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.description()+" con borde relleno";
    }

    @Override
    public float price() {
        return pizza.price()+4;
    }
}
