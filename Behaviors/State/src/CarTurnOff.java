public class CarTurnOff implements IStateCar {
    private final Car car;

    public CarTurnOff(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("The car is on!");
        car.setActualState(car.getCarTurnOn());
    }

    @Override
    public void drive() {
        System.out.println("The car cannot be driven if it is turned off.");
    }

    @Override
    public void turnOff() {
        System.out.println("The car is already off");
    }
}
