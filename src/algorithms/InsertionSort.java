package algorithms;

import java.util.Random;

public class InsertionSort {
    public static void insertionSortExample() {
        /*Insertion sort = after comparing elements to the left
        shift elements to the right to make room to insert a value

        Small data set = decent
        Large data set = bad
        runtime complexity: O(n^2) Quadratic time*/


        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
        }

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
