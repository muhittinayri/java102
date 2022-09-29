package collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example6 {
    public static void main(String[] args) {
        Queue<Integer> l1 = new LinkedList<>();

        l1.add(10);
        l1.add(20);
        l1.add(15);

        System.out.println(l1.peek());

        System.out.println(l1.poll());

        System.out.println(l1.peek());
    }
}
