package datatypes;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExamples {

    public static void examplesOfPriorityQueue() {
        //PriorityQueue = FIFO(first in first out)
        //serves elements with the highest priorities first before elements with lower priority
        //Linear data structure
        //add = enqueue, offer()
        //remove = dequeue, poll()
        //PriorityQueue is a member of Collection


        //Strings in default order
        Queue<String> queue = new PriorityQueue<>();
        //Strings in reverse order
        Queue<String> reverseQueue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        reverseQueue.offer("B");
        reverseQueue.offer("C");
        reverseQueue.offer("A");
        reverseQueue.offer("F");
        reverseQueue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        while (!reverseQueue.isEmpty()) {
            System.out.println(reverseQueue.poll());
        }
    }
}
