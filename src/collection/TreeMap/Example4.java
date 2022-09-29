package collection.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Example4 {
    public static void main(String[] args) {
        System.out.print("TreeMap using TreeMap(SortedMap) constructor:\n");
        Example4thConstructor();
    }

    static void Example4thConstructor(){
        SortedMap<Integer, String> sorted_map = new ConcurrentSkipListMap<Integer, String>();

        sorted_map.put(10, "Geeks");
        sorted_map.put(15, "4");
        sorted_map.put(20, "Geeks");
        sorted_map.put(25, "Welcomes");
        sorted_map.put(30, "You");

        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(sorted_map);

        System.out.println("TreeMap : " + tree_map);
    }
}
