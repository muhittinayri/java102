package collection.TreeSet;

import java.util.TreeSet;

public class Example8 {
    public static void main(String[] args) {
        String ayrac = new String(new char[15]).replace("\0","-");
        TreeSet set = new TreeSet();
        set.add(26);
        set.add(12);
        set.add(23);
        set.add(11);

        System.out.println(ayrac + "\n< TreeSet Metotları >\n" + ayrac);
        System.out.println("\n-> Kuyruk içerisindeki Değerler : ");
        set.forEach(item -> System.out.print("[" + item + "]"));
        System.out.println("\n" + ayrac + "\n-> Remove(23) Metot Kullanımı : " + set.remove(23));
        System.out.println("\n-> Contains(23) Metot Kullanımı : " + set.contains(23));
        System.out.println("-> Ceiling(23) Metot Kullanımı : " + set.ceiling(23));
        System.out.println("-> Size() Metot Kullanımı : " + set.size());
        set.clear();
        System.out.println("-> Clear() Metodun Kullanımı Sonucunda isEmpty() : " + set.isEmpty() + "\n" + ayrac);
    }
}
