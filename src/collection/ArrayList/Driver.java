package collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(myList.get(0) * 3);
        myList.add(myList.get(1) * 2 + 50);
        myList.add(-myList.get(2));
        myList.add(myList.get(2) * myList.get(0));
        myList.add(-490 + myList.get(1) * 5);

        System.out.print("---------------\n-> Oluşturulan ArrayList Elemanları :");
        for (int i : myList) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\n---------------");
        Collections.sort(myList);
        System.out.print("-> Sıralanan ArrayList Elemanları : ");
        for (int i : myList) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\n---------------\n-> ArrayList Üzerinde Bulunan Eleman Sayısı (Count) : " + myList.stream().count() + "\n---------------");
        myList.remove(2);
        myList.remove(4);
        System.out.print("-> Elemanlar Silindikten Sonra ArrayList Düzeni : ");
        for (int i : myList){
            System.out.print("[" + i + "]");
        }
        System.out.println("\n---------------\n-> Kalan Eleman Sayısı (Size) : " + myList.size());
        myList.clear();
        System.out.println("\n---------------\n-> Clear Metodundan Sonraki Eleman Sayımız : " + myList.size() + "\n---------------");
    }
}

