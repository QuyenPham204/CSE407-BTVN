

public class Main {
    public static void main(String[] args) {
        // FileLogger
        ILogging fileLogger = new FileLogger();
        fileLogger.Log("Lỗi hệ thống");

        // EmailNotifier
        INotifying emailNotifier = new EmailNotifier();
        emailNotifier.Notify("Bạn có thông báo mới");

        // ServiceManager
        ServiceManager serviceManager = new ServiceManager();
        serviceManager.Log("Dịch vụ đã được khởi động");
        serviceManager.Notify("Dịch vụ đã gửi thông báo");
    }
}
