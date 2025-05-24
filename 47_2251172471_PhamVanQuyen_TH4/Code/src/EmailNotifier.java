public class EmailNotifier implements INotifying {
    @Override
    public void notify(String message) {
        System.out.println("Gửi thông báo email: " + message);
    }
}