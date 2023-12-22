package algorithms;

import java.util.Arrays;

public class LinearSearch {
    public static void linearSearchExample() {
        /*linear search = Iterate through a collection one element at a time
        runtime complexity: O(n)

        Disadvantages:
        Slow for large data sets
        Advantages:
        Fast for searches of small to medium data sets
        Doesn't need to be sorted
        Useful for data structures that don't have random access (LinkedList)*/
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = linearSearch(array, 15);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!");
        }
    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
