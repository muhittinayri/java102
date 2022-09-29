package collection.Map;

import java.util.*;

public class HashMapExample2 {
    public static void main(String[] args) {
        String ayrac = new String(new char[15]).replace("\0", "-");

        HashMap<String, String> periyodik = new HashMap<>();

        periyodik.put("B", "Bor");
        periyodik.put("H", "Hidrojen");
        periyodik.put("Au", "Altın");
        periyodik.put("Ag", "Gümüş");
        periyodik.put("U", "Uranyum");

        int puan = 0, dogru = 0, yanlis = 0, degisim = 0;
        String tahmin = null, key, value;
        Scanner scanner = new Scanner(System.in);

        System.out.println(ayrac + "\n<Java HashMap Örnekleri>\n" + ayrac);
        System.out.println("-> Periyodik tablo üzerinde bulunan elementleri tahmin edin.\n" + ayrac);

        Set set = periyodik.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()){
            Map.Entry mEntry = (Map.Entry) itr.next();
            value = (String) mEntry.getValue();
            key = (String) mEntry.getKey();

            if (degisim < 2){
                System.out.println("-> [" + key + "] Hangi Elementin Kısaltılmasıdır : ");
                tahmin = scanner.nextLine();
                if (tahmin.equals(value)){
                    puan += 100;
                    dogru += 1;
                }else{
                    puan -= 125;
                    yanlis -= 1;
                }
                degisim++;
            }else{
                System.out.println("-> [" + value + "] Elementinin Kısaltması Nedir : ");
                tahmin = scanner.nextLine();
                if (tahmin.equals(key)){
                    puan += 100;
                    dogru += 1;
                    degisim = 0;
                }else {
                    puan -= 125;
                    yanlis += 1;
                }
            }
        }
        System.out.println(ayrac + "\n-> Doğru Sayısı : " + dogru + "\n-> Yanlış Sayısı : " + yanlis + "\n-> Toplanan Puan : " + puan + "\n" + ayrac);
    }
}
