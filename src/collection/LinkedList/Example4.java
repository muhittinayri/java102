package collection.LinkedList;

import java.util.LinkedList;

public class Example4 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("Geeks");
        l1.add("Geeks");
        l1.add(1, "For");

        System.out.println("Initial LinkedList : " + l1);

        l1.remove(1);

        System.out.println("After the Index Removal : " + l1);

        l1.remove("Geeks");

        System.out.println("After the Object Removal : " + l1);
    }
}
