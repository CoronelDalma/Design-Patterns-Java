public class Facade {
    private  Computer computer;

    // Se ocultan al clientes las cosas complejas
    public Facade() {
        IKeyboard keyboard = new Keyboard();
        IMouse mouse = new Mouse();
        this.computer = new Computer(keyboard, mouse);
    }

    // tareas complejas realizadas por facade. el cliente no se entera de todo lo que hay detras
    public void on() {
        this.computer.on();
    }
}
