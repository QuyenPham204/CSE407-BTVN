public class ConsoleLogger implements ILogging {
    @Override
    public void log(String message) {
        System.out.println("Console log: " + message);
    }
}