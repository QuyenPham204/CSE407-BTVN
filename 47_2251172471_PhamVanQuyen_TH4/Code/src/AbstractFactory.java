public interface AbstractFactory {
    ILogging createLogger();
    INotifying createNotifier();
}
