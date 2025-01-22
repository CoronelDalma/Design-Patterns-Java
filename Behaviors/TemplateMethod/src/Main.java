//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User manager = new Manager();
        User admin = new Admin();

        manager.authentication();
        admin.authentication();
        manager.work();
        admin.work();
    }
}