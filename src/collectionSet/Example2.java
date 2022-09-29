package collectionSet;

import java.util.HashSet;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");

        System.out.println("Set is : " + hs);

        String check = "D";

        System.out.println("Contains : " + check + " " + hs.contains(check));
    }
}
