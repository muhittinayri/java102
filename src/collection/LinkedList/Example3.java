package collection.LinkedList;

import java.util.LinkedList;

public class Example3 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("Geeks");
        l1.add("Geeks");
        l1.add(1, "Geeks");

        System.out.println("Initial LinkedList : " + l1);

        l1.set(1, "For");

        System.out.println("Updated LinkedList : " + l1);
    }
}
