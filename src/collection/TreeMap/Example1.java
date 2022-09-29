package collection.TreeMap;

import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {
        System.out.print("TreeMap using " + "TreeMap() constructor:\n");
        Example1stConstructor();
    }

    static void Example1stConstructor(){
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

        tree_map.put(10, "Geeks");
        tree_map.put(15, "4");
        tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");

        System.out.println("TreeMap : " + tree_map);
    }
}
