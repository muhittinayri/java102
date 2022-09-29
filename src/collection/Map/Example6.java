package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Example6 {
    public static void main(String[] args) {
        Map<Integer, String> hm1 = new HashMap<Integer, String>();

        hm1.put(new Integer(1), "Geeks");
        hm1.put(new Integer(2), "Geeks");
        hm1.put(new Integer(3), "Geeks");

        System.out.println("Initial Map " + hm1);

        hm1.put(new Integer(2), "For");

        System.out.println("Updated Map " + hm1);
    }
}
