package encapsulation;

public class encapsulation {
/*
ava Kapsülleme kavramı bir sınıf içerisinde bulunan metot ve değişkenlere dışarıdan erişmenin istenilmediği
 durumlarda kullanılan bir yöntemdir. Bu açıdan kapsülleme kavramını, veriyi güvenli bir kasa içerisinde
 muhafaza etme işlemi olarak tanımlamam yanlış olmayacaktır. Java Encapsulation kullanımı ile sınıf üyeleri,
  dışardaki sınıflardan gizlenir.

  Kapsülleme kavramını teorik olarak anlamamız aslında çok zor ama bilindik bir örnek üzerinden yardım
   alırsak bazı şeyler şekillenmeye başlayacaktır. Bilgisayarımızı açmak için güç tuşuna basmamız gerektiğini
   biliyoruz fakat bilgisayar açılırken arka plan üzerinde hangi işlemleri gerçekleştirdiğini bilmiyoruz. Sadece
   bu işlemlerin nasıl yapılacağını bilebiliriz. Bu işleme encapsulation diyoruz.


    public class accessModifiers {
        // Public Metot ve Değişken Tanımlaması:
        public String webSite = "www.emrecelen.com.tr";
        public String mySite(){
            return "Web Adresim: ";
        }
        // Protected Metot ve Değişken Tanımlaması:
        protected String myName = "Emre";
        protected  String mySurName(){
            return "Çelen";
        }
        // Default Metot ve Değişken Tanımlanması:
        String birMerhaba = "Merhaba !";
        int myAge(){
            return 23;
        }
        // Private Metot ve Değişken Tanımlası:
        private String secretMail = "iletisim@emrecelen.com.tr";
        private void secretMethod(){
            System.out.println("Private Metot Erişim Sağlandı.");
        }
    }

      Getter ve Setter Metotlar
      Java Encapsulation kavramı ile ayrılmaz bir ikili konumunda olan getter ve setter metotlar oldukça
       önemli bir konudur. Erişim belirleyiciler başlığı altında oluşturmuş olduğum tabloda ve örnek
       üzerinde private olarak tanımladığımız elemanlara, başka bir sınıf üzerinde erişim sağlanamaz.
       Bir nevi anahtar görevi gören bu metotlar sayesinde private olarak tanımlı elemanlar okunabilir
       veya içerisindeki değerleri değiştirebiliriz. Bu verileri okuyabilmek için getter, içerisindeki
        verileri değiştirmek için setter metotlarını kullanırız.



    */
}
