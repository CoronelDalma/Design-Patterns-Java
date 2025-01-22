//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Without using proxy, without restrictions for users
        IService service = new Service();
        System.out.println("WITHOUT RESTRICTIONS");
        // all users can
        service.read();
        service.write();
        service.update();
        service.remove();

        // With proxy because now I apply restrictions to users
        User user1 = new User(5);
        User user2 = new User(4);
        IService serviceProxy = new ProxyService(service, user1);
        System.out.println("WITH RESTRICTIONS");
        serviceProxy.read(); //<-- for all users
        serviceProxy.write(); // only admins
        serviceProxy.update();// only admins
        serviceProxy.remove();// only admins

        IService serviceProxy2 = new ProxyService(service, user2);
        System.out.println("WITH RESTRICTIONS");
        serviceProxy2.read(); //<-- for all users
        serviceProxy2.write(); // only admins
        serviceProxy2.update();// only admins
        serviceProxy2.remove();// only admins
    }
}