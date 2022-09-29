package collection.LinkedHashSetExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(10);
        lSet.add(20);
        lSet.add(30);

        Iterator<Integer> itr = lSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}

/*
LinkedHashSet, tüm öğeler arasında çift bağlantılı bir Liste tutan sıralı bir HashSet sürümüdür.
Yineleme sırasının korunması gerektiğinde bu sınıf kullanılır. Bir HashSet aracılığıyla yinelendiğinde,
sıra öngörülemezken, LinkedHashSet öğeler arasında eklendikleri sırayla yineleme yapmamıza izin verir. Bir
yineleyici kullanarak LinkedHashSet üzerinden geçiş yaparken, öğeler eklendikleri sırayla döndürülür.
 */
