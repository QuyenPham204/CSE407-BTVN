public class Factory2 implements AbstractFactory {
    @Override
    public ILogging createLogger() {
        return new ConsoleLogger();
    }

    @Override
    public INotifying createNotifier() {
        return new SMSNotifier();
    }
}
