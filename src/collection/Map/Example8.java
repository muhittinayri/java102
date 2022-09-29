package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Example8 {
    public static void main(String[] args) {
        Map<Integer, String> hm1 = new HashMap<Integer, String>();

        hm1.put(new Integer(1), "Geeks");
        hm1.put(new Integer(2), "For");
        hm1.put(new Integer(3), "Geeks");

        for (Map.Entry mapElement : hm1.entrySet()){
            int key = (int) mapElement.getKey();
            String value = (String) mapElement.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
