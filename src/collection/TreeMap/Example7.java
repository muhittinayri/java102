package collection.TreeMap;

import java.util.TreeMap;

public class Example7 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");
        System.out.println(tm);
        tm.put(2,"For");
        System.out.println(tm);
    }
}
