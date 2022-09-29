package collection.LinkedHashSetExample;

import java.util.LinkedHashSet;

public class Example2 {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        System.out.println("LinkedHashSet : " + hs);
    }
}
