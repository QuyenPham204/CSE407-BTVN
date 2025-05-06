public class WorkerThread extends Thread {
    private int id;
    private int start;
    private int end;
    private SharedData data;
    private int max = Integer.MIN_VALUE;

    public WorkerThread(int id, int start, int end, SharedData data) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.data = data;
    }

    public int getResult() {
        return max;
    }

    @Override
    public void run() {
        int[] arr = data.getArray();

        // Duyệt qua đoạn mảng từ start đến end để tìm giá trị lớn nhất
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // In kết quả trung gian
        System.out.println("Luồng " + id + ": Max = " + max + " - Thời gian: " + System.currentTimeMillis());
    }
}
