public class User implements IObserver{
    @Override
    public void notification(String message) {
        System.out.println(message);
    }
}
