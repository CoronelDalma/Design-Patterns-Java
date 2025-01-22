public class ExtraCheese implements IPizza{
    //composicion
    private IPizza pizza;

    public ExtraCheese(IPizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String description() {
        return pizza.description()+" queso extra";
    }

    @Override
    public float price() {
        return pizza.price()+2;
    }
}
