//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction(new Deposit());
        System.out.println(transaction1.executeTransaction(100, 20));

        Transaction transaction2 = new Transaction(new Withdrawal());
        System.out.println(transaction2.executeTransaction(100, 80));
    }
}