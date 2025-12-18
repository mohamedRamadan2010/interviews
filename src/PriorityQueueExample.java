import java.util.*;

public class PriorityQueueExample {

    public static void main(String[] args) {

        //Priority Queue = A FIFO data structure that serves elements
        //                             with the highest priorities first
        //				  before elements with lower priority

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());


        queue.offer(40);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(50);

        System.out.println(queue.poll());

    }
}
