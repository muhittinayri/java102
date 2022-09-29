package collection.LinkedList;

import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("Geeks");
        l1.add("Geeks");
        l1.add(1, "For");

        System.out.println(l1);
    }
}
