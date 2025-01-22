public class Keyboard implements IKeyboard{
    @Override
    public void connect() {
        System.out.println("Teclado conectado");
    }

    @Override
    public void off() {
        System.out.println("Teclado apagado");
    }
}
