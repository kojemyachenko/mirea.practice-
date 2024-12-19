package kojemyachenko_hmw;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int size = 100000;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000);
        }

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();
        System.out.println("Время выполнения сортировки: " + stopwatch.getElapsedTime() + " ms");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
