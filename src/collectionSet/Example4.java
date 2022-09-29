package collectionSet;

import java.util.HashSet;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");

        for (String value : hs) {
            System.out.print(value + ", ");

        }
    }
}
