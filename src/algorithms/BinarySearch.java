package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void binarySearchExample() {

        /*binary search = Search algorithm that finds the position of a target value within a sorted array
        Half of the array is eliminated during each "step"
        runtime complexity: O(log(n))*/

        int[] array = new int[1000000];
        int target = 777777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int index = Arrays.binarySearch(array, target);
        if (index == -1) {
            System.out.println(target + " not found! (Arrays.binarySearch())");
        } else {
            System.out.println("Element found at index: " + index + " (Arrays.binarySearch())");
        }

        index = binarySearch(array, target);
        if (index == -1) {
            System.out.println(target + " not found! ");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Middle of this step is: " + value);

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;
            }

        }

        return -1;
    }
}
