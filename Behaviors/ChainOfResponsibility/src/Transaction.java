public class Transaction {
    private float quantity;
    private float balance;
    private TransactionType transactionType;

    public Transaction(float quantity, float balance, TransactionType transactionType) {
        this.quantity = quantity;
        this.balance = balance;
        this.transactionType = transactionType;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
