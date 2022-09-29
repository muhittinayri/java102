package collection;

public class Main {
    /*
    Collection Arayüzü (interface)

    Çoğu zaman programlarımızı geliştirirken tek bir öge yerine ögelerden oluşan diziler tanımlamak isteriz. Bu
    tanımlamalarda eğer veri tipimiz aynı ise, eleman sayımız belliyse standart bir dizi tanımlaması gerçekleştiriyorduk.
    Söz konusu değerlerin belirsizliği durumunda ise collection framework içerisinde bulunan interfaceler ve bu
    interfacelerden oluşan kurgulardan faydalanırız.
    Bu oluşumların en temelinde List, Set ve Map olmak üzere üç tip yer almaktadır. Bu kavramlardan Set ve List, Java
    Collection interface’ini kullanırken Map kavramı ise ayrı bir tür olarak bu yapıdan ayrılır. Bu yapıların bütününü
    ele aldığımızda ortaya Java Collection Framework çıkmaktadır.
    Konumuzu fazla dağıtmadan asıl sorumuz olan “Java Collections Nedir” sorusuna dönecek olursak verileri saklamak,
    saklanan veriyi çekmek, işlemek ve zaman zaman sakladığımız yerde çeşitli verileri aramak için collections kullanırız.

    Collection alt başlığında bulunan “Set, List ve Queue” kavramlarını ele alarak ne işe yaradıklarını kısa bir şekilde ele alalım.

    List Bölümü: Tanımlanan değerleri hafızasında sıralı bir şekilde tutar ve tekrarlanan değer atamaları yapılabilir.
    Set Bölümü: List bölümünün aksine kopya ya da tekrarlanan herhangi bir atama barındırmaz.
    Queue Bölümü: Kuyruk anlamına gelmektedir, ilk atanan değer her zaman ilk olarak çıkar. Bu yapısı ile birlikte FIFO(first in-first out)
    kavramı ile birlikte anılır.

    Map Bölümü: Tanımlanan değerlerin kendisine özel bir anahtar ile eşleştiren interface bölümüdür.
    Tanımlanan değerler key ve value olarak hafızada tutulur. Set bölümünde olduğu gibi tekrarlanabilir,
    kopya bir anahtar tanımlanması yapılmaz.

    **Java Collections Avantajları

    Belki de bu kavramı öğrenmeme vesile olan en temel avantajı, veri ekledikçe veya çıkardıkça, collection yapısının
    uzunluğunu otomatik olarak ayarlaması ve bizim için oldukça büyük bir esneklik sağlaması.

    Listeleme, sıralama gibi çeşitli algoritmaları oturup sıfırdan yazmamıza gerek bırakmadan collections içerisinde
    bulunan algoritmaları kullanmamıza imkan sağlar.
    Oluşturduğumuz uygulamaya sağlayacağı esneklik ve performans arttırıcılığı özelliği ile uğraşmamız gereken
    sıkıntıları otomatik olarak çözer.

    Verileri bir araya toplayarak işlem yapmamızı kolaylaştırır.


    **Java Collections Dezavantajları

    Programımızın derlenme esnasında, oluşturduğumuz koleksiyon yapılarının veri tiplerinin denetiminin gerçekleştirilmemesi.

    Koleksiyon yapılarımızı oluştururken atayacağımız veri tipinin doğru bir şekilde seçilmesi gerekmektedir.


    Bu üç interface’den kalıtım alan alt sınıflar ise aşağıdaki gibidir.

    List interface’den kalıtım alan alt sınıflar: ArrayList, LinkedList, Vector, Stack

    Queue interface’den kalıtım alan alt sınıflar: PriorityQueue, ArrayQueue

    Set interface’den kalıtım alan alt sınıflar: HashSet, LinkedHashSet, TreeSet
     */
}
