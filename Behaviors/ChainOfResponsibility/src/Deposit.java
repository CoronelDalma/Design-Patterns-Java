public class Deposit implements ITransactionHandler{
    private ITransactionHandler next;
    @Override
    public void setNextHandler(ITransactionHandler next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if (transaction.getTransactionType() == TransactionType.DEPOSIT) {
            float qty = transaction.getQuantity() + transaction.getBalance();
            System.out.println("new balance (deposit): "+qty);
        } else {
            this.next.executeTransaction(transaction);
        }
    }
}
