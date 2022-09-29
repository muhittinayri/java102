package collectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example7 {
    public static void main(String[] args) {
        Set<String> lh = new LinkedHashSet<String>();
        lh.add("India");
        lh.add("Australia");
        lh.add("South Africa");
        lh.add("India");

        System.out.println(lh);

        lh.remove("Australia");
        System.out.println("Set after removing " + "Australia : " + lh);

        System.out.println("Iterating over set : ");
        Iterator<String> i = lh.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
