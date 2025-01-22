//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // en este ejemplo,una mejora es hacerlo tambien con virtual proxy, ya que estoy generando objetos q no uso
        Transaction transaction = new Transaction(100, 200, TransactionType.DEPOSIT);

        ITransactionHandler deposito = new Deposit();
        ITransactionHandler retiro = new Withdrawal();
        ITransactionHandler reembolso = new Refund();

        //chain
        deposito.setNextHandler(retiro);
        retiro.setNextHandler(reembolso);

        deposito.executeTransaction(transaction);
    }
}