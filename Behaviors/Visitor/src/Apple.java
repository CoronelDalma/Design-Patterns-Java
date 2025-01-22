public class Apple implements IFruit, IVisitable{
    @Override
    public float getPrice() {
        return 3f;
    }

    @Override
    public float applyDiscount(IVisitor visitor) {
        return visitor.visit(this);
    }
}
