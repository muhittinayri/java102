package collection.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Example7 {
    public static void main(String[] args) {

        Set<StringBuffer> ts = new TreeSet<>();

        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("O"));
        ts.add(new StringBuffer(1));

        System.out.println(ts);
    }
}
