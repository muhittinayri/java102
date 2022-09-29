package collection.LinkedHashMap;

import java.util.LinkedHashMap;

public class Example4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(3, "Geeks");
        hm.put(2, "Geeks");
        hm.put(1, "Geeks");
        hm.put(4, "For");

        System.out.println("Initial Map : " + hm);

        hm.remove(4);

        System.out.println("Updated Map : " + hm);
    }
}
