public class Transaction {
    private IStrategy strategy;

    public Transaction(IStrategy strategy) {
        this.strategy = strategy;
    }

    public float executeTransaction(float balance, float qty) {
        return this.strategy.makeOperation(balance, qty);
    }
}
