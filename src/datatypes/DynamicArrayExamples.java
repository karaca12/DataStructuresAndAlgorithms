package datatypes;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrayExamples {
    public static void examplesOfDynamicArray() {
        //ArrayList in Java
        //Vector in C++
        //Array in JavaScript
        //List in Python

        //Advantages?
        //1. Random access of elements O(1)
        //2. Good locality of reference and data cache utilization
        //3. Easy to insert/delete at the end

        //Disadvantages?
        //1. Wastes more memory
        //2. Shifting elements is time consuming O(n)
        //3. Expanding/Shrinking the array is time consuming O(n)

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList);
        System.out.println("Size: " + arrayList.size());
        System.out.println("Is empty: " + arrayList.isEmpty());

        arrayList.add(1, "X");
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        arrayList.remove("C");
        System.out.println(arrayList);

        arrayList.add("C");
        arrayList.add("C");
        arrayList.remove("C");//in this case it only removes 1 C
        System.out.println(arrayList);
    }
}
