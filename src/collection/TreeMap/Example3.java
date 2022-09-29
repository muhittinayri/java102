package collection.TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example3 {
    public static void main(String[] args) {
        System.out.print("TreeMap using "
                + "TreeMap(Map)"
                + " constructor:\n");
        Example3reConstructor();
    }

    static void Example3reConstructor(){
        Map<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>(hash_map);

        System.out.println("TreeMap : " + tree_map);
    }
}
