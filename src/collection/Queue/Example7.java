package collection.Queue;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Example7 {
    public static void main(String[] args) {
        Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();

        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        System.out.println(pbq.peek());

        System.out.println(pbq.poll());

        System.out.println(pbq.peek());
    }
}
