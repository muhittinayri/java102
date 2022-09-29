package collection.LinkedHashSetExample;

import java.util.LinkedHashSet;

public class Example1 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
        linkedSet.add("A");
        linkedSet.add("B");
        linkedSet.add("C");
        linkedSet.add("D");

        linkedSet.add("A");
        linkedSet.add("E");

        System.out.println("Size of LinkedHashSet : " + linkedSet.size());

        System.out.println("Original LinkedHashSet : " + linkedSet);

        System.out.println("Removing D from LinkedHashSet : " + linkedSet.remove("D"));

        System.out.println("Trying to remove z which is not : " + linkedSet.contains("A"));

        System.out.println("Updated LinkedHashSet : " + linkedSet);
    }
}
