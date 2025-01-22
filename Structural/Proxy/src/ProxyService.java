public class ProxyService implements IService{
    private IService service;
    private User user;

    public ProxyService(IService service, User user) {
        this.service = service;
        this.user = user;
    }

    @Override
    public void read() {
        this.service.read();
    }

    @Override
    public void write() {
        if (user.getPermissionLevel() >= 5) {
            this.service.write();
        } else {
            System.out.println("Not allowed");
        }
    }

    @Override
    public void update() {
        if (user.getPermissionLevel() >= 5) {
            this.service.update();
        } else {
            System.out.println("Not allowed");
        }
    }

    @Override
    public void remove() {
        if (user.getPermissionLevel() >= 5) {
            this.service.remove();
        } else {
            System.out.println("Not allowed");
        }
    }
}
