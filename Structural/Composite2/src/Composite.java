import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent{
    private String name;
    private List<IComponent> children = new ArrayList<IComponent>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(IComponent component) {
        children.add(component);
    }

    public void remove(IComponent component) {
        children.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Composite: " + name);
        for (IComponent child: children) {
            child.display();
        }
    }
}
