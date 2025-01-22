import Products.IComputer;
import Products.ITablet;

public interface IAbstractFactory {
    IComputer createComputer();
    ITablet createTablet();
}
