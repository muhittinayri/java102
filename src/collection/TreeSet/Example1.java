package collection.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {
        String ayrac = new String(new char[15]).replace("\0","-");

        Example1AvgDetails ogr1 = new Example1AvgDetails(254236,60,80);
        Example1AvgDetails ogr2 = new Example1AvgDetails(254248,30,70);
        Example1AvgDetails ogr3 = new Example1AvgDetails(254242,85,95);
        Example1AvgDetails ogr4 = new Example1AvgDetails(254255,55,71);

        TreeSet<Example1AvgDetails> tree = new TreeSet<>();
        tree.add(ogr1);
        tree.add(ogr2);
        tree.add(ogr3);
        tree.add(ogr4);

        System.out.println("[Öğrenci Numarası]\t\t[İlk Sınav]\t\t[İkinci Sınav]\t[Ortalama]");
        Iterator iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
