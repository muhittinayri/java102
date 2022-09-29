package collection.LinkedHashSetExample;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {
        Set<String> hs = new LinkedHashSet<String>();

        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        Iterator itr = hs.iterator();

        while (itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        System.out.println();

        for (String s : hs){
            System.out.print(s + ", ");
        }
    }
}
