package collection.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Example6 {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        for (String value : ts){
            System.out.print(value + ", ");
        }
    }
}
