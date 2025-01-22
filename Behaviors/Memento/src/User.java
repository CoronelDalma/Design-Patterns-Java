public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Memento
    public User getMemento() {
        return new User(this.getName(), this.getAge());
    }

    public void restoreMemento(User memento) {
        this.setName(memento.getName());
        this.setAge(memento.getAge());
    }
}
