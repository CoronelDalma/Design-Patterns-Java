//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int numberOfThreads = 2;
        // Create multiple threads that access the Singleton
        Runnable task = () -> {
            ConnectionDB connection = ConnectionDB.getConnection();
            System.out.println(connection.hashCode());
        };

        // Create 10 threads trying to access the same instance
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
        }
    }
}