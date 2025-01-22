//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IComponent leaf1 = new Leaf("Leaf 1");
        IComponent leaf2 = new Leaf("Leaf 2");
        IComponent leaf3 = new Leaf("Leaf 3");

        Composite composite1 = new Composite("Composite 1");
        composite1.add(leaf1);
        composite1.add(leaf2);

        Composite composite2 = new Composite("Composite 2");
        composite2.add(leaf3);

        Composite mainComposite = new Composite("Main composite");
        mainComposite.add(composite1);
        mainComposite.add(composite2);

        mainComposite.display();
    }
}