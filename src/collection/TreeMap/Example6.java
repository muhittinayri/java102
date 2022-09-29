package collection.TreeMap;

import java.util.TreeMap;

public class Example6 {
    public static void main(String[] args) {
        TreeMap tm1 = new TreeMap();
        tm1.put(3,"Geeks");
        tm1.put(2,"For");
        tm1.put(1,"Geeks");

        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();

        tm2.put(new Integer(3), "Geeks");
        tm2.put(new Integer(2), "For");
        tm2.put(new Integer(1), "Geeks");

        System.out.println(tm1);
        System.out.println(tm2);
    }
}
