package collectionSet;

import java.util.HashSet;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");
        System.out.println("Initial HashSet " + hs);
        hs.remove("B");
        System.out.println("After removing element : " + hs);
    }
}
