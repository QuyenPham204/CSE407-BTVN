public class Factory1 implements AbstractFactory {
    @Override
    public ILogging createLogger() {
        return new FileLogger();
    }

    @Override
    public INotifying createNotifier() {
        return new EmailNotifier();
    }
}
