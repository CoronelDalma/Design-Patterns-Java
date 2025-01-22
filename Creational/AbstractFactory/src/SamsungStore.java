import Products.IComputer;
import Products.ITablet;
import Products.SamsungGalaxyBookGo;
import Products.SamsungGalaxyTabA9;

public class SamsungStore implements IAbstractFactory{
    @Override
    public IComputer createComputer() {
        return new SamsungGalaxyBookGo();
    }

    @Override
    public ITablet createTablet() {
        return new SamsungGalaxyTabA9();
    }
}
