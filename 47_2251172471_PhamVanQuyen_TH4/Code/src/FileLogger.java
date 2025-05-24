public class FileLogger implements ILogging {
    @Override
    public void log(String message) {
        System.out.println("Ghi log: " + message);
    }
}
