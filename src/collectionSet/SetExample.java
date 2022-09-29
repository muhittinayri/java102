package collectionSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();

        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two Set");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of the two set");
        System.out.println(intersection);

        Set<Integer> diffrence = new HashSet<Integer>();
        diffrence.removeAll(b);
        System.out.println("Diffrence of the two Set");
        System.out.println(diffrence);
    }
}
