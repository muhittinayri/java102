package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExampleMain {
    public static void main(String[] args) {
        List nonGenericList = new ArrayList();
        List<String> genericList = new ArrayList<>();
        nonGenericList.add("String Bir Değer Atıyorum");
        nonGenericList.add(100 + " İstersem Integer Bir Değer, " + 15.5 + " İstersem Double Bir Değer Atıyabiliyorumç");

        genericList.add("Sadece String Bir Değer Atıyorum.");
        genericList.add("<VeriTipi> Yapısına Elmas'da deniliyor.");
        System.out.println("----------------\n< Non-Generic Tanımlamalar >\n----------------\n-> " + nonGenericList.get(0) + " \n-> " + nonGenericList.get(1));
        System.out.println("----------------\n< Generic Tanımlamalar >\n----------------\n-> " + genericList.get(0) + " \n-> " + genericList.get(1) + "\n----------------\"");
    }

    /*
    Java Generic Tanımlama

    Konuyu temelden ele alacak olursak Java’da her oluşturduğumuz sınıf yapısı Object sınıfından türeyen alt sınıflardır.
    Bu yüzden oluşturduğumuz her bir nesne Object tipine ait nesnelerdir.

    Bu özelliğinden dolayı oluşturduğumuz bu nesneleri her veri tanımlaması içerisinde kullanabiliriz. Tanımladığımız
    bu yapılar program derlenirken bir hata vermez fakat run-time esnasında programımız, tanımlı verilerin aynı tipte
    olmadığını tespit ederek bizlere hata göstermesi olası bir hale gelir. Bu sorunu çözmek içinde kullanacağımız
    kurtarıcı kavram Generic yapılardır.

    Uzun lafın kısası, Java Generic, programlarımız içerisinde farklı referans veri tiplerine ev sahipliği yapacak
    işlemlerimize, üzerinde hangi referans tiplerini taşımasını istediğimize karar vermemize olanak sağlayan bir sınıftır.

    Generic yapımızı belirttiğimiz < ve > işareti literatür içerisinde diamond 💎 olarak geçer ve bu kavram arasında
    belirttiğimiz veri tipleri ile işlemlerimizi, sınıflarımızı generic bir yapı haline getirmiş oluruz.


    Java Generic Avantajları ve Neden Kullanmalıyız?

    Bir çok dilin aksine Java, tip güvenliği (type safety) olan bir dildir. Yani bir veri tanımlaması yapmak istediğimiz
    zaman hangi türde bir değer tanımlaması yaptığımızı belirtmek zorundayız. Programımız bu atamaları derleme esnasında
    kontrol ederek yanlış bir atama durumunda bizlere bu konuyu bildirerek bir exception fırlatır.

    Bu sorunu, non-generic bir tanımlama tip ihlali yapıp yapmadığımızı kontrol edilmez bir hale getirdiği için derleme
    esnasında değil programın çalışma esnasında hatalar ile karşılaşabiliriz. Bu durumda hatanın kaynağını erken
    keşfetmekten daha ötede zorlaştırıcı bir yapı içerisinde kendimizi saç baş yolarken bulmamız kaçınılmaz
    bir hale gelir.

    Bu sorun ile karşılaşmamak için programlarımızın içerisinde java generic tanımlama yaparak işlemlerimizdeki
    hataları minimuma indirebilir ve Runtime sırasında ortaya çıkacak ClassCastException hatalarını programımızın
    derlenme esnasında yakalayabiliriz.

    Java Generic İsimlendirme Standartları

    Harf : E
    Anlamı Element
    Tanımı : Collection Fraemwork de kullanılır.

    Harf : K
    Anlamı Key

    Harf : N
    Anlamı Number

    Harf : T
    Anlamı Type

    Harf : V
    Anlamı Value

    Harf : S, U, V, VB.
    Tanımı : Fazla Tanımlama Yapılırsa Kullanılır.

    Şu zamana kadar konu işlerken hep olarak bir tanımlama yapmamıza rağmen yukarıda yer alan ifadeleri de
    kullanabiliriz. Bu ifadelerin dışında çeşitli tanımlamalarda gerçekleştirebiliriz faka bu tablo üzerinde
    yer alan ifadeler java isimlendirme standartlarında yer alan ifadelerdir



     */
}
