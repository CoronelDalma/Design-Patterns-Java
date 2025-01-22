public class WashingMachine implements IWhiteGoods, IVisitable{
    @Override
    public float getPrice() {
        return 50f;
    }

    @Override
    public float applyDiscount(IVisitor visitor) {
        return visitor.visit(this);
    }
}
