package collection.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        int n = 5;

        List<Integer> l1 = new LinkedList<Integer>();

        for (int i = 1; i <= n; i++){
            l1.add(i);
        }

        System.out.println(l1);

        l1.remove(3);

        System.out.println(l1);

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}
