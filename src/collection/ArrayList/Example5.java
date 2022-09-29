package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("Geeks");
        a1.add("Geeks");

        a1.add(1, "For");

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i) + " ");
        }

        System.out.println();

        for (String str : a1){
            System.out.println(str + " ");
        }
    }
}
