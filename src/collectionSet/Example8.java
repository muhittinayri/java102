package collectionSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Example8 {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<String>();
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        ts.add("India");
        System.out.println(ts);

        ts.remove("Australia");

        System.out.println("Set after removing " + "Australia : " + ts);

        System.out.println("Iterating over set : ");

        Iterator<String> i = ts.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
