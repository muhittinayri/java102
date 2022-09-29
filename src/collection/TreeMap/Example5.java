package collection.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Example5 {
        static TreeMap<Integer, String> tree_map;

        static void create(){
            tree_map = new TreeMap<Integer, String>();
            System.out.print("TreeMap successfully created");
        }

        static void insert(){
            tree_map.put(10, "Geeks");
            tree_map.put(15, "4");
            tree_map.put(20, "Geeks");
            tree_map.put(25, "Welcomes");
            tree_map.put(30, "You");

            System.out.print("\nElements successfully inserted in the TreeMap");
        }

        static void search(int key){
            System.out.print("\nIs Key \"" + key + "\" present ? " + tree_map.containsKey(key));
        }

        static void search(String value){
            System.out.print("\nIs value \"" + value + "\" present ? " + tree_map.containsValue(value));
        }

        static void display(){
            System.out.print("\nDisplaying the TreeMap : ");
            System.out.print("TreeMap : " + tree_map);
        }

        static void traverse(){
            System.out.print("\nTraversing the TreeMap : ");
            for (Map.Entry<Integer, String> e : tree_map.entrySet()){
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }

    public static void main(String[] args) {
            create();
            insert();
            search(50);
            search("Geeks");
            display();
            traverse();
    }
}
