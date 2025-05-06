import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử trong mảng (nên > 100)
        System.out.print("Nhập số phần tử của mảng (ví dụ 120): ");
        int n = scanner.nextInt();

        // Nhập số luồng
        System.out.print("Nhập số luồng muốn sử dụng (k > 1): ");
        int k = scanner.nextInt();

        // Khởi tạo mảng dữ liệu
        SharedData data = new SharedData(n);

        // Tính số phần tử mỗi luồng xử lý
        int phanDoan = n / k;
        WorkerThread[] threads = new WorkerThread[k];

        // Tạo và khởi chạy các luồng
        for (int i = 0; i < k; i++) {
            int start = i * phanDoan;
            int end = (i == k - 1) ? n : (start + phanDoan);
            threads[i] = new WorkerThread(i + 1, start, end, data);
            threads[i].start();
        }

        // Đợi các luồng kết thúc
        for (int i = 0; i < k; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Tổng hợp kết quả từ các luồng
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            if (threads[i].getResult() > max) {
                max = threads[i].getResult();
            }
        }

        System.out.println("===> Giá trị lớn nhất trong mảng: " + max);
    }
}
