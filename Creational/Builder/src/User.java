public class User {
    private String name;
    private String lastname;

    private String email;
    private String phone;
    private String direction;

    private User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.email = "";
        this.phone = "";
        this.direction = "";
    }

    public static User make(String name, String lastname) {
        return new User(name, lastname);
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getDirection() {
        return direction;
    }

    public User setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    public User Build() {
        return this;
    }

    public String toString() {
        return "User: "+this.name+" "+this.lastname+" "+this.email+" "+this.phone+" "+this.direction;
    }

}
