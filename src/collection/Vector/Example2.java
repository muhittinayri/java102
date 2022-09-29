package collection.Vector;

import java.util.Vector;

public class Example2 {
    public static void main(String[] args) {
        Vector v1 = new Vector();

        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);

        System.out.println("Vector v1 is " + v1);

        Vector<Integer> v2 = new Vector<Integer>();

        v2.add(1);
        v2.add(2);
        v2.add(3);

        System.out.println("Vector v2 is : " + v2);
    }
}
