package collection.LinkedList;

import java.util.LinkedList;

public class Example5 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();

        l1.add("Geeks");
        l1.add("Geeks");
        l1.add(1, "For");

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        for (String str : l1) {
            System.out.print(str + " ");
        }
    }
}
