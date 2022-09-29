package exception;

public class TopicSummary {
    /*
    Java Exception Handling Nedir?
    Java Exception Handling Nedir başlığımızı parçalara bölerek gidecek olursak, Exception kavramının Türkçe karşılığının
    istisnalar olarak yapıldığını görürüz. Handling kavramı ise işlemek, kullanmak gibi anlamlara gelmekte, bu anlamlar
    birleştirildiği zaman literatüre hata yakalama olarak geçiş sağlamıştır.

    Peki, programlarımız içerisinde bu kavram neyi ifade ediyor diye soracak olursanız onunda açıklamasını kod blokları
    arasında oluşan anormal durumlar olarak yapabilirim. 🔦 Bu kavramı biraz daha açarak buz dağının keşfinde biraz daha
    derinlere inelim.

    Her program oluşturulduğu zaman bazı hatalar ile karşılaşmamız olası bir hale gelir ve bu hata yapılarına göre kendi
    içlerinde ayrıştırılır. Bazı ortaya çıkan hataları Java sayesinde yakalamamız daha kolay bir haldeyken bazı hataları
    bizzat kendimizin kod bloklarını kurcalayarak bulmamız gerekebilir ve son olarak ise geri dönülemez, tamir edilmesi
    mümkün olmayan bazı hata tipleri ile karşılaşmamız mümkündür.

    Bu exception türleri yukarıda belirttiğim gibi üç temel başlığa ayrılır bunlara aşağıdaki başlıkta göz attıktan sonra
    java exception handling işlemi için örnekler oluşturmaya başlayabiliriz.

    Java Exception Türleri

    Checked Exception (🤗): Programımızın temelinde meydana gelebileceği olası bir takım hatalar söz konusu oluyor ve bu
    kod satırını oluştururken program bize bir try-catch tanımlaması ya da throws açıklaması yapmamızı istiyorsa bu hata
    türüne Checked Exception denilir.Mesela ilerleyen konularımızda göreceğimiz JDBC ile veri tabanı bağlantısı kuracağımız
    zaman ya da bir dosyaya ulaşarak işlem yapmamız gerektiğinde kullanacağımız IOException, SqlException gibi kavramlar
    kullanmamız gerekir.


    Unchecked Exception (😨): Yukarıdaki exception türünde yapmak istediğimiz işlemi java algılıyor ve bunun bir hata
    meydana getirebileceğini düşündüğü için önceden önlem alınmasını istiyordu fakat bu hata türümüzde java bizi bir
    tanımlama yapmaya zorlamıyor. Bu yapısı yüzünden de çoğu zaman geliştiricileri sinir krizine doğru götürebiliyor.
    Bu hata türüne örnek olarak programın vereceği RuntimeException veya bir değeri 0’a bölmeye çalışacağımız zaman
    verdiği ArithmeticException gibi örnekler verilebilir. Bu hata sonuçlarının çözümlerini bularak sonradan kendimizin
    müdahale etmesi gerekmektedir.


    Error (😱): Hata türleri içerisinde belki de karşılaşmak istemeyeceğimiz tek hata türü error olabilir. Programın
    çalışma esnasında meydana gelecek OutOfMemoryError, StackOverFlowError gibi yapıların çözümü için yazmış olduğumuz
    kod satırlarını bazen baştan sona değiştirmemiz gerekebilir.

     */
}
