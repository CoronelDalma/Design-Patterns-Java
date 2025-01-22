public class CommonDiscount implements IVisitor{
    @Override
    public float visit(IFruit fruit) {
        return fruit.getPrice() * 0.15f;
    }

    @Override
    public float visit(IWhiteGoods whiteGoods) {
        return whiteGoods.getPrice() * 0.05f;
    }
}
