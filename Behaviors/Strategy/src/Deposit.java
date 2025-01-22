public class Deposit implements IStrategy{
    @Override
    public float makeOperation(float balance, float qty) {
        return balance + qty;
    }
}
