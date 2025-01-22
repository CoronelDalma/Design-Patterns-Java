public class Refund implements ITransactionHandler {
    private ITransactionHandler next;
    @Override
    public void setNextHandler(ITransactionHandler next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if (transaction.getTransactionType() == TransactionType.REFUND) {
            float qty = transaction.getQuantity() - transaction.getBalance();
            System.out.println("new balance (refund): "+qty);
        } else {
            // last handler
            System.out.println("Invalid operation!");
        }
    }
}
