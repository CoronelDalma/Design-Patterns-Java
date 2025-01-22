//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User1 codi = User1.Make("Codi", "Facilito")
                .setContact(true)
                .setDirection("México")
                .Build();

        System.out.println(codi);
    }
}