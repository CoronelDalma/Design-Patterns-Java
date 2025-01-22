public class CarTurnOn implements IStateCar {
    private final Car car;

    public CarTurnOn(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("The car is on!");
    }

    @Override
    public void drive() {
        System.out.println("The car is moving");
        car.setActualState(car.getCarDrive());
    }

    @Override
    public void turnOff() {
        System.out.println("The car is off");
        car.setActualState(car.getCarTurnOff());
    }
}
