//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User edu = new User("Edu");
        User codi = new User("Codi");

        ChatRoom chatRoom = new ChatRoom();
        chatRoom.addUser(edu);
        chatRoom.addUser(codi);
        chatRoom.sendMessage(edu, codi, "hola codi");
    }
}