package collection.Vector;

import java.util.Vector;

public class Example4 {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add(1);
        v.add(2);
        v.add("Geeks");
        v.add("forGeeks");
        v.add(4);

        v.remove(1);

        System.out.println("after removal : " + v);
    }
}
