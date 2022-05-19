package day60_collection_continue;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        System.out.println(queue);
        //queue.get(); get method is from list
        System.out.println(queue);

        queue.offer(30);//same as add method
        System.out.println(queue);

        queue.offer(null);
        System.out.println(queue);

        //System.out.println(new PriorityQueue<>().remove()); --> causes exception bc there is no elements
        System.out.println(new PriorityQueue<>().poll()); // --> causes exception bc there is no elements
    }
}
