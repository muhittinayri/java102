package collection.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example5 {
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        System.out.println("Initial TreeSet : " + ts);

        ts.remove("B");

        System.out.println("After removing element : " + ts);

        ts.pollFirst();

        System.out.println("After removing first : " + ts);

        ts.pollLast();

        System.out.println("After removing last : " + ts);
    }
}
