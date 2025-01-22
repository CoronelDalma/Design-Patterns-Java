//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product aguacate = new Product(10);

        User user1 = new User();
        User user2 = new User();
        User user3 = new User(); // no observer

        aguacate.addObserver(user1);
        aguacate.addObserver(user2);
        aguacate.sale();

    }
}