public class Withdrawal implements ITransactionHandler{
    private ITransactionHandler next;
    @Override
    public void setNextHandler(ITransactionHandler next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if (transaction.getTransactionType() == TransactionType.WITHDRAWAL) {
            float qty = transaction.getQuantity() - transaction.getBalance();
            System.out.println("new balance (withdrawal): "+qty);
        } else {
            this.next.executeTransaction(transaction);
        }
    }
}
