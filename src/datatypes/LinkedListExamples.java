package datatypes;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void examplesOfLinkedList() {
        //LinkedList = stores Nodes in 2 parts (data+address)
        //Nodes are in con-consecutive memory locations
        //Elements are linked using pointers

        //advantages?
        //1. Dynamic data structure(allocates needed memory while running)
        //2. Insertion and Deletion of Nodes is easy. O(1)
        //3. No/Low memory waste


        LinkedList<String> linkedList = new LinkedList<>();

        //mimicking a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        System.out.println(linkedList);
        linkedList.clear();

        //mimicking a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.poll();
        System.out.println(linkedList);
        linkedList.clear();


        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.add(4, "E");
        System.out.println(linkedList);
        linkedList.remove("E");
        System.out.println(linkedList.indexOf("E"));//returns -1 because no E
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
