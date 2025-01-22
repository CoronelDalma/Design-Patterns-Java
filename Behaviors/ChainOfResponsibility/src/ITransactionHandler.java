public interface ITransactionHandler {
    void setNextHandler(ITransactionHandler next);

    void executeTransaction(Transaction transaction);
}
