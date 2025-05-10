import java.util.Random;

public class SharedData {
    public int[] array; // Mảng chứa các số nguyên

    public SharedData(int size) {
        array = new int[size];
        Random rand = new Random();
        // Sinh ngẫu nhiên các số trong khoảng từ 1 đến 1000
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000) + 1;
        }
//        array[size - 1] = 999 ;
    }

    public int[] getArray() {
        return array;
    }
}
