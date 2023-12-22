package datatypes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void examplesOfQueue() {
        /*
        Queue = FIFO(first in first out)
        A collection designed for holding elements prior to precessing
        Linear data structure
        add = enqueue, offer()
        remove = dequeue, poll()
        Queue is a member of Collection
        Uses of queues?
        1. Keyboard buffer(letters should appear on the screen in the order they are pressed)
        2. Printer queue(Print jobs should be completed in order)
        3. Used in LinkedLists, PriorityQueues, Breadth-first search
        */

        //linkedlists implement queue and queue is an interface, so we use linkedlist, and we are not going to be able to use all the features of queue
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
