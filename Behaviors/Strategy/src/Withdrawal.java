public class Withdrawal implements IStrategy {
    @Override
    public float makeOperation(float balance, float qty) {
        return balance - qty;
    }
}
