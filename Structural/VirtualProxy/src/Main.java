//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1 = new User(5);
        User user2 = new User(4);
        IService serviceProxy = new ProxyService(user1);
        System.out.println("WITH RESTRICTIONS");
        serviceProxy.read(); //<-- for all users
        serviceProxy.write(); // only admins
        serviceProxy.update();// only admins
        serviceProxy.remove();// only admins
    }
}