//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConnectionDB connection = ConnectionDB.getConnection();
        ConnectionDB connection2 = ConnectionDB.getConnection();
        System.out.println(connection.hashCode());
        System.out.println(connection2.hashCode());
    }
}