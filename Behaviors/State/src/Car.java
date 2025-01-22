public class Car implements IStateCar {
    private IStateCar carTurnOn;
    private IStateCar carDrive;
    private IStateCar carTurnOff;

    private IStateCar actualState;

    public Car() {
        this.carTurnOn = new CarTurnOn(this);
        this.carDrive = new CarDrive(this);
        this.carTurnOff = new CarTurnOff(this);
        this.actualState = this.carTurnOn;
    }

    @Override
    public void turnOn() {
        this.actualState.turnOn();
    }

    @Override
    public void drive() {
        this.actualState.drive();
    }

    @Override
    public void turnOff() {
        this.actualState.turnOff();
    }

    public IStateCar getCarTurnOn() {
        return carTurnOn;
    }

    public void setCarTurnOn(IStateCar carTurnOn) {
        this.carTurnOn = carTurnOn;
    }

    public IStateCar getCarDrive() {
        return carDrive;
    }

    public void setCarDrive(IStateCar carDrive) {
        this.carDrive = carDrive;
    }

    public IStateCar getCarTurnOff() {
        return carTurnOff;
    }

    public void setCarTurnOff(IStateCar carTurnOff) {
        this.carTurnOff = carTurnOff;
    }

    public IStateCar getActualState() {
        return actualState;
    }

    public void setActualState(IStateCar actualState) {
        this.actualState = actualState;
    }
}
