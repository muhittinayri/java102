package collection.Vector;

import java.util.Vector;

public class Example3 {
    public static void main(String[] args) {
        Vector<Integer> vec_tor = new Vector<Integer>();

        vec_tor.add(12);
        vec_tor.add(23);
        vec_tor.add(22);
        vec_tor.add(10);
        vec_tor.add(20);

        System.out.println("Vector : " + vec_tor);

        System.out.println("The Object that is replaced is : " + vec_tor.set(0, 21));

        System.out.println("The Object that is replaced is : " + vec_tor.set(4, 50));

        System.out.println("The new Vector is : " + vec_tor);
    }
}
