public class Pizzeria {
    //If you have to go to the db, call an API,
    // check something,
    // it is done here and the client does not find out
    public Pizza createSPizza() {
        // DB, File, API
        return new Pizza(6);
    }

    public Pizza createMPizza() {
        return new Pizza(8);
    }

    public Pizza createXLPizza() {
        return new Pizza(12);
    }
}
