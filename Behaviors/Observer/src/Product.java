import java.util.LinkedHashSet;
import java.util.Set;

public class Product implements IObservable{
    private int stock;
    private Set<IObserver> observers;

    public Product(int stock) {
        this.stock = stock;
        this.observers = new LinkedHashSet<>();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // observer
    public void sale() {
        this.setStock(this.stock-1);
        System.out.println("Product sold!");
        this.notifyObservers();
    }

    @Override
    public void addObserver(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer: this.observers) {
            observer.notification("The product was sold");
        }
    }

    @Override
    public void removeObserver() {

    }
}
