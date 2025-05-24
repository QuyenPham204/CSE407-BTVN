public class SMSNotifier implements INotifying {
    @Override
    public void notify(String message) {
        System.out.println("Gửi tin nhắn SMS: " + message);
    }
}
