public class ServiceManager implements ILogging, INotifying {
    @Override
    public void Log(String message) {
        System.out.println("Service log: " + message);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Service notify: " + message);
    }
}