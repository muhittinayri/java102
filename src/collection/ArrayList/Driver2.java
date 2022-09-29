package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Driver2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(7);
        list.add("Mustafa Enes");
        list.add("Oğuz");
        list.add("Ömer Faruk");
        list.add("Kemal");
        list.add("Oğuz");

        Object[] array = new Object[5];
        array = list.toArray();
        System.out.println("------------------------\n< Java ArrayList Kullanımı > \n------------------------\n-> ArrayList Elemanları : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + list.get(i) + "] ");
        }
        System.out.println("\n------------------------\n-> toArray Kullanımı Sonucunda Oluşan Dizi : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + array[i] + "] ");
        }
        System.out.println("\n----------------------\n-> lastIndexOf('Oğuz') Kullanımı: "+list.lastIndexOf("Oğuz")+"\n----------------------\n-> Contains('Ömer Faruk') Kullanımı: "+list.contains("Ömer Faruk")+"\n----------------------");
    }
}
