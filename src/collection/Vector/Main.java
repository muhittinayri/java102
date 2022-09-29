package collection.Vector;

import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("İzmir");

        vector.add(2,"Bolu");

        System.out.println(vector.contains("Ankara"));

        Iterator<String> itr = vector.iterator();

        while (itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }

        System.out.println();

        for (String str : vector) {
            System.out.print(str + ", ");
        }
    }
}

/*
    Vector

    Klasik programlama eyleminde array (dizi) çok önemli bir rol oynar. Ancak, array’in uzunluğu; yani bileşenlerinin
    sayısı array bildiriminde belirleniyor ve bu uzunluk daha sonra değiştirilemiyordu. Bazı uygulamalarda, bu özelik
    ciddi bir handikap oluşturur. Java 2, bu sorunu çözmek için Vector sınıfını ve benzer işi yapan ArrayList sınıfını
    ortaya koydu. Her iki sınıfta, diziye yeni öğeler eklenir ya da varolan öğeler silinirse, dizinin uzunluğu
    kendiliğinden değişir. Tabii, bu değişimin bellek kullanımı ve zaman açısından bir bedeli (karmaşa – complexity)
    vardır. Ama, java programcısı bu işleri yapan yordamları kendisi yazmak zorunda değildir. Vector ya da ArrayList
    sınıfına ait nesneler bu işleri kendiliğinden yaparlar.

    Vector tipinden dizilerin öğeleri, aynen array tipinde olduğu gibi, birer indise sahiptir. Dolayısyla , vector’un
    öğelerine indisleri ile doğrudan erişim sağlanır.

    ArrayList senkronize olmadığı için Vector sınıfına göre daha hızlıdır. Elbette hızlı olmanın bir bedeli vardır.
    Senkronize olmaması demek, çoklu işlem ortamında güvenirliğin azalması demektir.
 */
