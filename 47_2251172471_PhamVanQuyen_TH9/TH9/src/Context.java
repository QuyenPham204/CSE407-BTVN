public class Context {
    private ILogging logger;
    private INotifying notifier;

    public void setLogger(ILogging logger) {
        this.logger = logger;
    }

    public void setNotifier(INotifying notifier) {
        this.notifier = notifier;
    }

    public void performLogging(String message) {
        if (logger != null) {
            logger.Log(message);
        }
    }

    public void performNotifying(String message) {
        if (notifier != null) {
            notifier.Notify(message);
        }
    }
}