package collection.TreeMap.Example2;

import java.util.TreeMap;

public class GFG {
    static void Example2ndConstructor(){
        TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new Sortbyroll());

        tree_map.put(new Student(111, "bbbb", "london"), 2);
        tree_map.put(new Student(131, "aaaa", "nyc"), 3);
        tree_map.put(new Student(121, "cccc", "jaipur"), 1);

        System.out.println("TreeMap : " + tree_map);
    }

    public static void main(String[] args) {
        System.out.print("TreeMap using TreeMap(Comparator) constructor:\n");
        Example2ndConstructor();
    }
}
