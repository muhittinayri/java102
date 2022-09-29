package collection.Vector;

import java.util.Vector;

public class Example1 {
    public static void main(String[] args) {
        int n = 5;

        Vector<Integer> v = new Vector<>(n);

        for (int i = 1; i <= n; i++) {
            v.add(i);
        }

        System.out.println(v);

        v.remove(3);

        System.out.println(v);

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }
}
