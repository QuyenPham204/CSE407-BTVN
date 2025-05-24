public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        ServiceManager manager1 = new ServiceManager(factory1);
        manager1.someOperation();

        System.out.println("---");

        AbstractFactory factory2 = new Factory2();
        ServiceManager manager2 = new ServiceManager(factory2);
        manager2.log("Đăng nhập hệ thống");
        manager2.notify("Cảnh báo bảo mật!");
    }
}
