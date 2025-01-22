public class ProxyService implements IService{
    private IService service; //expensive
    private User user;

    public ProxyService(User user) {
        this.user = user;
    }

    @Override
    public void read() {
        this.getService().read();
    }

    @Override
    public void write() {
        if (user.getPermissionLevel() >= 5) {
            this.getService().write();
        } else {
            System.out.println("Not allowed");
        }
    }

    @Override
    public void update() {
        if (user.getPermissionLevel() >= 5) {
            this.getService().update();
        } else {
            System.out.println("Not allowed");
        }
    }

    @Override
    public void remove() {
        if (user.getPermissionLevel() >= 5) {
            this.getService().remove();
        } else {
            System.out.println("Not allowed");
        }
    }

    // creation of the expensive object is done once
    private IService getService() {
        if (this.service == null) {
            this.service = new Service();
        }
        return this.service;
    }
}
