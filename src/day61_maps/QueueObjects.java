package day61_maps;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("hello");
        queue.offer("world");
        queue.offer("java");
        queue.offer("selenium");
        queue.offer("apple");
        queue.offer("zebra");
        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.poll());

        queue.offer("apple");
        System.out.println(queue);

        ArrayDeque<String> arrayDeque = new ArrayDeque<>(); //(FIFO)
        arrayDeque.offer("hello");
        arrayDeque.offer("world");
        arrayDeque.offer("java");
        arrayDeque.offer("selenium");
        arrayDeque.offer("apple");
        arrayDeque.offer("zebra");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekLast());

        arrayDeque.offerFirst("new word");
        System.out.println(arrayDeque);


    }
}
