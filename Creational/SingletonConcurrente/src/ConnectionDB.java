public class ConnectionDB {
    //must be private and static
    private static ConnectionDB connection;

    //constructor must be private
    private ConnectionDB() {

    }

    // must be static
    public synchronized static ConnectionDB getConnection() {
        if (connection == null) {
            connection = new ConnectionDB();
        }
        return connection;
    }
}
