package inheritanceSample;

public class TopicSummary {
    /*
    Inheritance

    Java Inheritance temel seviyede kodlama yaparken bile ihtiyaç duyulan bir yapıdır. Bir çok projede farklı sınıflar
    birbirleriyle aynı değişkenleri veya aynı metotları içerebilirler. Bu gibi durumlarda aynı kodların tekrar tekrar
    yaratılmasını önlemek için Java’da sınıflar birbirinden türeyebilirler.

    Superclass ve Subclass

    Sınıfların birbirlerinden türemeleri sonucunda superclass ve subclass kavramları ortaya çıkar. Bir sınıf başka
    bir sınıftan türüyorsa yani başka bir sınıfın değişkenlerini ve metotlarını miras alıyorsa subclass olarak
    adlandırılır. Eğer bir sınıftan başka bir sınıf miras alınıyor veya türetiliyorsa o sınıf superclass
    olarak adlandırılır.

    Object Sınıfı

    Java Inheritance aslında temelde var olan hatta yazılımcıların farkında olmadan kullandıkları bir yapıdır.
    Java’da kullanılan tüm sınıflar Object sınıfından  türetilmiştir. Bir sınıfın tipi bilinmiyorsa bu sınıf new
    operatörüyle Object sınıfına eşitlenebilir. Bu bir problem yaratmayacaktır, çünkü temelde Object sınıfından
    türemektedir.  Tüm sınıflar Object sınıfından türedikleri için de Object sınıfı içindeki değişken ve metotları
    miras alırlar.

    Teorik olarak;

    Subclass, paket yapısı farketmeksizin tüm protected ve public üyeleri superclass’tan miras alabilir.

    Miras alınan alanlar sınıf içerisindeki diğer üyelerin kullanıldığı gibi direk olarak kullanılabilirler.

    Superclass içerisindeki bir değişken ile aynı isimde bir değişken subclass içerisinde üretildiğinde
    bu olay hiding(gizleme) olarak adlandırılır. (önerilmez)

    Superclass içerisindeki bir metot ile aynı isimde bir metot subclass içerisinde üretildiğinde bu olay overriding
    olarak adlandırılır.

    Superclass içerisindeki static bir metot ile aynı isimde bir static metot subclass içerisinde üretildiğinde
    bu olay hiding olarak adlandırılır. (önerilmez)

    Java Inheritance yapısından faydalanılarak kod tekrarının önlendiği, temiz kodlar yazılabilir. Büyük projelerde
    bir çok sınıfta kullanılan metotta bir dğeişiklik yapıldığında tek bir yerde değişikliği uygulama çoğu zaman
    yeterli olacaktır. Bu şekilde Java’da önem arzeden bakımı kolay, esnek ve geliştirmeye ve değiştirmeye açık
    kodlar yazmak daha kolay hale gelecektir.

     */
}
