package K3L5;

import java.util.Scanner;

public class Main {

    private static final int size = 10000000;

    public static void main(String[] args) {
        float[] arr = new float[size];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во разбиений массива: ");
        int h = scanner.nextInt();

        initArray(arr);
        long time = System.currentTimeMillis();
        new Thread(new CalculateArray(arr)).run();
        System.out.println("Время последовательной обработки массива: " + (System.currentTimeMillis() - time) + " мс.");

        initArray(arr);
        time = System.currentTimeMillis();
        float[][] arrays = splitArray(arr, h);
        Thread[] threads = new Thread[h];
        for (int i = 0; i < arrays.length; i++) {
            threads[i] = new Thread(new CalculateArray(arrays[i]));
            threads[i].start();
        }
        for (int i = 0; i < arrays.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        arr = combineArray(arrays);
        System.out.println("Время параллельной обработки массива: " + (System.currentTimeMillis() - time) + " мс.");
    }

    private static void initArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
    }

    private static float[][] splitArray(float[] array, int partCount) {
        float[][] result = new float[partCount][];
        int partLength = array.length / partCount;
        for (int i = 0; i < partCount; i++) {
            int length = partLength;
            if (i == partCount - 1) {
                length = array.length - i * length;
            }
            result[i] = new float[length];
            System.arraycopy(array, i * partLength, result[i], 0, length);
        }
        return result;
    }

    private static float[] combineArray(float[][] array) {
        float[] result = new float[size];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, result, i*array.length, array[i].length);
        }
        return result;
    }
}
