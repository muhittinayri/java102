package collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        String ayrac = new String(new char[10]).replace("\0","-");
        LinkedList <Integer> list = new LinkedList<>();
        list.add(327);
        list.add(846);
        list.add(121);
        list.addLast(86);
        list.addFirst(314);
        list.add(419);
        System.out.println(ayrac+"\n< Java Linked List Metotları >\n"+ayrac);
        System.out.print("-> Oluşturulan LinkedList Elemanları: ");
        list.forEach(i -> System.out.print("[ "+i+" ]"));
        System.out.println("\n"+ayrac);
        System.out.print("-> Sıralanan Linked List Elemanları (Sort): ");
        Collections.sort(list);
        list.forEach(i -> System.out.print("[ "+i+" ]"));
        System.out.println("\n"+ayrac);
        System.out.print("-> Linked List Üzerinde Bulunan Eleman Sayısı (Count): "+list.stream().count());
        System.out.println("\n"+ayrac+"\n-> Get (4) Metodunun Sonucu: "+list.get(4)+"\n"+ayrac);
        list.removeLast();
        list.removeFirst();
        list.remove(3);
        System.out.print("-> Elemanlar Silindikten Sonra LinkedList Yapısı: ");
        list.forEach(i -> System.out.print("[ "+i+" ]"));
        System.out.println("\n"+ayrac+"\n-> Kalan Eleman Sayısı (Size): "+list.size());
        list.clear();
        System.out.println(ayrac+"\n-> Clear Metodunun Sonucunda Eleman Sayısı: "+list.size()+"\n"+ayrac);

    }
}
