/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg47_2251172471_phamvanquyen_th3;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        LoggerCreator loggerCreator = new FileLoggerCreator();
        Logging logger = loggerCreator.createLogger();
        logger.log("Đăng nhập thành công");

        NotifierCreator notifierCreator = new EmailNotifierCreator();
        Notifying notifier = notifierCreator.createNotifier();
        notifier.notify("Có người truy cập hệ thống");

        ServiceManagerCreator serviceCreator = new ServiceManagerCreator();
        Logging serviceLogger = serviceCreator.createLogger();
        Notifying serviceNotifier = serviceCreator.createNotifier();

        serviceLogger.log("Khởi động dịch vụ");
        serviceNotifier.notify("Cảnh báo hệ thống!");
    }
}
