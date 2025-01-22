import Products.IComputer;
import Products.ITablet;
import Products.Ipad;
import Products.MacbookPro;

public class AppleStore implements IAbstractFactory{
    @Override
    public IComputer createComputer() {
        return new MacbookPro();
    }

    @Override
    public ITablet createTablet() {
        return new Ipad();
    }
}
