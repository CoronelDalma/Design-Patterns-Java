import java.util.HashMap;

public class ChatRoom {
    private HashMap<String, User> users;

    public ChatRoom() {
        this.users = new HashMap<String, User>();
    }

    public void addUser(User user){
        this.users.put(user.getName(), user);
    }

    // logic to communicate objects
    public void sendMessage(User sender, User receiver, String msg) {
        if (this.users.get(sender.getName()) != null &&
            this.users.get(receiver.getName()) != null) {
            String message = "De :" + sender.getName()+" Mensaje: "+msg;
            receiver.getMessage(message);
        }
    }
}
