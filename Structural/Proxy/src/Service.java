public class Service implements IService{
    @Override
    public void read() {
        System.out.println("Reading from the db!");
    }

    @Override
    public void write() {
        System.out.println("Writing in the db!");
    }

    @Override
    public void update() {
        System.out.println("Updating db!");
    }

    @Override
    public void remove() {
        System.out.println("removing frm the db!");
    }
}
