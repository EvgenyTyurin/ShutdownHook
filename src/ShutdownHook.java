/**
 * Shutdown hook demo
 */

public class ShutdownHook {
    public static void main(String[] args) {
        // Add some actions on program exit
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Job's done.");
            System.out.println("Oh, yea!");
        }));
    }
}
