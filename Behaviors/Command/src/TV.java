public class TV implements IDevice{
    private boolean on;

    public TV() {
        this.on = false;
    }

    @Override
    public void on() {
        this.on = true;
        System.out.println("TV on");
    }

    @Override
    public void off() {
        this.on = false;
        System.out.println("TV off");
    }
}
