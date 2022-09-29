package collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Mustafa");
        liste.add("Çetindağ");
        liste.add("Mustafa");
        liste.add("Java");
        liste.add("102");

        //liste.remove("Mustafa");
        liste.remove(2);

        Iterator<String> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("**********************************");

        for (String str : liste) {
            System.out.println(str);
        }
    }
}

/*
    LinkedList Sınıfı

    Çift yönlü bağlı liste algoritmasının Java implementasyonudur. Her eleman önceki ve sonraki elemanını işaret edecek
    şekilde iki yönlü bir ilişki kurulmuştur. Listenin ben başına hem sonuna eleman eklenip çıkarılabilir, bu işlemler için
    metotlar mevcuttur. LinkedList’te eleman silme veya araya eleman ekleme durumlarında kaydırma işlemi yapılmaz.

    Bu listeye gönderilen veriler, arka planda özel bir obje ile sarılır (wrap) edilir. Bu objeler birbirini gösterecek şekilde referanslar objelere konur, böylece birbirlerine bağlanırlar.

    Kullanılacak veri grubunu bir listeye koymamız ve bu gruba veri ekleme işlemi sürekli yapılacaksa, LinkedList kullanılması önerilir.

    LinkedList sınıfı, ArrayList gibi thread-safe değildir. Bu List türünde de veri bütünlüğünü sorunu vardır.

    LinkedList, hem List interface'inden hem Queue (Kuyruk) interface'inden miras alan bir sınıftır.
 */
