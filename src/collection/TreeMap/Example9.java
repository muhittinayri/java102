package collection.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Example9 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(3, "Geeks");
        tm.put(2, "For");
        tm.put(1, "Geeks");

        for (Map.Entry mapElement : tm.entrySet()) {
            int key = (int)mapElement.getKey();
            String value = (String)mapElement.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
