package collection.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example4 {
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

        System.out.println("Tree set is : " + ts);

        String check = "Geeks";

        System.out.println("Contains " + check + " " + ts.contains(check));

        System.out.println("First Value : " + ts.first());

        System.out.println("Last Value : " + ts.last());

        String val = "Geek";

        System.out.println("Higher : " + ts.higher(val));
        System.out.println("Lower : " + ts.lower(val));
    }
}
