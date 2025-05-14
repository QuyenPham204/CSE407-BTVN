
public class FileLogger implements ILogging {
    @Override
    public void Log(String message) {
        System.out.println("Ghi log: " + message);
    }
}
