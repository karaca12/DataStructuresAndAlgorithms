package algorithms;

import java.util.Random;

public class SelectionSort {
    public static void selectionSortExample() {
        /*Selection sort = search through an array and keep track of the minimum value during each iteration.
        At the end of each iteration, we swap variables.
        Small data set = okay
        Large data set= not okay at all
        runtime complexity: O(n^2) Quadratic time*/

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
        }

        selectionSort(array);


        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
