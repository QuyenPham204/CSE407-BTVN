public class ServiceManager {
    private ILogging logger;
    private INotifying notifier;

    public ServiceManager(AbstractFactory factory) {
        this.logger = factory.createLogger();
        this.notifier = factory.createNotifier();
    }

    public void someOperation() {
        logger.log("Thực hiện một thao tác quan trọng...");
        notifier.notify("Đã hoàn tất thao tác.");
    }

    public void log(String message) {
        logger.log("Service log: " + message);
    }

    public void notify(String message) {
        notifier.notify("Service notify: " + message);
    }
}
