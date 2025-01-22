public class CarDrive implements IStateCar {
    private final Car car;

    public CarDrive(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("The car is already on!");
    }

    @Override
    public void drive() {
        System.out.println("The car is already moving");
    }

    @Override
    public void turnOff() {
        System.out.println("The car is off");
        car.setActualState(car.getCarTurnOff());
    }
}
