package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();

        a1.add("Geeks");
        a1.add("Geeks");
        a1.add(1,"Geeks");

        System.out.println("Initial ArrayList : " + a1);

        a1.set(1, "For");

        System.out.println("Updated ArrayList : " + a1);
    }
}
