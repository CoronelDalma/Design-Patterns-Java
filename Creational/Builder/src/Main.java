//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = User.make("Dalma","GiGI").Build();
        User user2 = User.make("Dalma2","GiGI")
                .setEmail("email@email.com")
                .Build();
        System.out.println(user);
        System.out.println(user2);
    }
}