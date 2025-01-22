public interface IObservable {
    void addObserver(IObserver o);
    void notifyObservers();
    void removeObserver();
}
