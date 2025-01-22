public class User1 {
    private String name;
    private String lastname;

    private boolean contact;  //optional. If true then enable filling in the following optional fields, otherwise no

    private String email;
    private String phone;
    private String direction;

    // Constructors
    public BuilderUser setContact(boolean contact) {
        if (!contact) {
            throw new IllegalArgumentException("No es posible asignar un valor falso a contact");
        }
        this.contact = contact;
        return new BuilderUser(this);
    }

    private User1(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.email = "";
        this.phone = "";
        this.direction = "";

        this.contact = false;
    }

    public static User1 Make(String name, String lastname) {
        return new User1(name, lastname);
    }

    public User1 Build() {
        return this;
    }

    public String toString() {
        return "User: "+this.name+" "+this.lastname+" "+this.email+" "+this.phone+" "+this.direction;
    }

    // new class with optional attributes
    public static class BuilderUser{
        private final User1 user;

        public BuilderUser(User1 user){
            this.user = user;
        }

        public BuilderUser setEmail(String email) {
            user.email = email;
            return this;
        }

        public String getPhone() {
            return user.phone;
        }

        public BuilderUser setPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public String getDirection() {
            return user.direction;
        }

        public BuilderUser setDirection(String direction) {
            user.direction = direction;
            return this;
        }

        public User1 Build() {
    return user;
}
    }

}
