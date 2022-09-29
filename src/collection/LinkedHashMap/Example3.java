package collection.LinkedHashMap;

import java.util.LinkedHashMap;

public class Example3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(3, "Geeks");
        hm.put(2, "Geeks");
        hm.put(1, "Geeks");

        System.out.println("Initial map : " + hm);

        hm.put(2, "For");

        System.out.println("Updated Map : " + hm);
    }
}
