//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IDevice tv = new TV();

        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevice(tv);

        on.operation();
        off.operation();
    }
}