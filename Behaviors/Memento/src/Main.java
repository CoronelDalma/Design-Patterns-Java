//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Gigi", 6);
        User memento = user.getMemento(); //user copy

        System.out.println(user.getName());
        System.out.println(user.getAge());

        user.setName("nuevo nombre");
        user.setAge(17);

        System.out.println(user.getName());
        System.out.println(user.getAge());

        user.restoreMemento(memento);
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}