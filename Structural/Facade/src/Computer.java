public class Computer {
    IKeyboard keyboard;
    IMouse mouse;

    public Computer(IKeyboard keyboard, IMouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void on() {
        this.keyboard.connect();
        this.mouse.connect();
    }
}
