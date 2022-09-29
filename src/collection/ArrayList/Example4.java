package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();

        a1.add("Geeks");
        a1.add("Geeks");

        a1.add(1, "For");

        System.out.println("Initial ArrayList : " + a1);

        a1.remove(1);

        System.out.println("After the index Remoal : " + a1);

        a1.remove("Geeks");

        System.out.println("After the Object Remoal : " + a1);
    }
}
