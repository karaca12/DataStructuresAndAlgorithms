package algorithms;

import java.util.Random;

public class BubbleSort {
    public static void bubbleSortExample() {
        /*Bubble sort = pairs of adjacent elements are compared, and the elements swapped if they are not in order
        Small data set = okay
        Large data set= not okay at all
        runtime complexity: O(n^2) Quadratic time*/
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
        }

        bubbleSort(array);


        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
