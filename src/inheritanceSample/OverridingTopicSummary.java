package inheritanceSample;

public class OverridingTopicSummary {
    /*
    Java Overriding, programlarımızda kullandığımız kalıtım sayesinde üst sınıftan, alt sınıfa geçecek metotların o
    sınıf yapısına uygun bir şekilde tekrardan gövdesinin değiştirilmesine ve kod satırlarının yeniden şekil almasına
    olanak sağlayacaktır. Tabii bu imkanları sağlarken bazı uymamız ve dikkat etmemiz kuralların olduğunu unutmamalıyız.

    Bu teorik bilgiyi hemen bir örnek üzerinden giderek daha iyi anlamaya çalışalım. Örneğimiz üzerinde bir otomobil
    firmasını düşünerek ilk adımımızı atalım. Örneğimizdeki bu firma içerisinde çeşitli arabaların gösterildiği
    stantların bulunduğu yerlerin olduğunu ve bu stant bölgesinin önünde orada yer alan araçların özelliklerinin
    bulunduğunu bir tanıtım broşürünün olduğunu varsayalım. Bir müşteri olarak gittiğimiz bu firma içerisindeki
    stant önlerinde yer alan broşürlere baktığımızda araçların motor hacimlerinin, kullandığı enerjinin, boyasının
    ve diğer tüm teknik özelliklerinin değiştiğini gözlemleriz. Temelde aynı olarak gözüken başlıkların kendi
    içerisinde değişmesi, başka bir konuda hizmet vermesine imkan ver yapının bütünü override kavramının ta
    kendisidir.

    Teorik bilgimizi verdikten ve akılları biraz daha karıştıracak örnek yapımızı oluşturduktan sonraki adımımızda
    Override yapısını kullanırken dikkat etmemiz gereken kurallar ve bize sağlamış olduğu avantajları incelemek var


    Java Overriding Kullanım Kuralları
    Üst sınıf içerisinde yer alan private metotlar override işlemine tabi tutulmaz. Aksi takdirde hata alınır.
    Override ettiğimiz bir metodun erişim belirleyicisinin seviyesini düşüremeyiz fakat yükseltebiliriz.
    Üst sınıftan miras aldığımız bir metodun dönüş tipini veya parametrelerini değiştiremeyiz.
    Static ve Final olarak tanımlı metotları override edemeyiz.
    Üst sınıfımızdaki ve alt sınıfımızda bulunan override edeceğimiz metot isimleri aynı olmalıdır.
    Constructor (Yapıcı / Kurucu) metotlar override edilemez.

    Java Overriding Kullanımının Avantajları
    Temiz, sade ve anlaşılır kod satırları oluşturmamıza imkan sağlar.
    Bir sınıfın hangi yapıda duruş sergileyeceğini ve metotların işlevlerinin nasıl uygulanacağını tanımlamamıza imkan sağlar.
     */
}
