public class PizzaPepperoni implements IPizza{
    @Override
    public String description() {
        return "Pizza de pepperoni";
    }

    @Override
    public float price() {
        return 8;
    }
}
