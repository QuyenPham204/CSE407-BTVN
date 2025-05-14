
public class EmailNotifier implements INotifying {
    @Override
    public void Notify(String message) {
        System.out.println("Gửi thông báo email: " + message);
    }
}
