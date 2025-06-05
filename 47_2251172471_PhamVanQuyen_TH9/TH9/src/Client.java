public class Client {
    private Context context;

    public Client(Context context) {
        this.context = context;
    }

    // Example usage
    public static void main(String[] args) {
        Context context = new Context();
        context.setLogger(new FileLogger());
        context.setNotifier(new EmailNotifier());

        Client client = new Client(context);
        context.performLogging("Test logging message");
        context.performNotifying("Test notification message");
    }
}