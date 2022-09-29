package collection.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver3 {
    public static void main(String[] args) {
        List<Integer> myRandomList = new ArrayList<>();
        Random random = new Random();
        int value, total = 0, cift = 0, tek = 0;
        System.out.print("-------------------\n < Random ArrayList Oluşturma > \n-------------------\n-> Oluşturulan Dizi Elemanları :");
        for (int i = 0; i < 10; i++) {
            value = random.nextInt(1000) + 1;
            myRandomList.add(value);
            total += myRandomList.get(i);
            if (myRandomList.get(i) % 2 == 0) {
                cift += 1;
            } else {
                tek += 1;
            }
            System.out.print("[" + myRandomList.get(i) + "] ");
        }
        System.out.print("\n----------------------\n-> Dizi Elemanlarının Toplamı: " + total + "\n----------------------\n-> Dizideki Çift Sayı Adedi: " + cift + "\n----------------------\n-> Dizideki Tek Sayı Adedi: " + tek + "\n----------------------");
    }
}

