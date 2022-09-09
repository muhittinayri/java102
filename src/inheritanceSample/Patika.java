package inheritanceSample;

public class Patika {
    public static void main(String[] args) {

        Calisan c1 = new Calisan("Mehmet Ayrı", "0123456789", "info@patika.dev");
        System.out.println(c1.getAdSoyad());
        Akademisyen a1 = new Akademisyen("Muhittin Ayrı", "123456789", "muhittin@patika.dev", "cebg", "doçent");
        a1.derseGir();

        Memur m1 = new Memur("Ali Ayrı", "123456798", "ali@patika.dev", "IT", "09-18");
        m1.calis();

        OgretimGorevlisi o1 = new OgretimGorevlisi("Gönül Ayrı", "123456789", "gonul@patika.com", "IT", "prof", "2");
        o1.giris();
        o1.derseGir();

        Asistan as1 = new Asistan("Adem Topal", "123456789", "adem@patika.com","Rehber", "Rehber","12-15");
        as1.derseGir();
        as1.quizYap();

        BilgiIslem b1 = new BilgiIslem("Adil Topal", "1234567989","adil@patika.dev", "IT", "15-18", "Network");
        b1.giris();
        b1.networkKurulum();
        b1.cikis();

        GuvenlikGorevvlisi g1 = new GuvenlikGorevvlisi("Eyüp Yapıcı", "01234647897", "eyup@patika.dev", "Guvenlik","02-06","1234");
        g1.nobet();

        LabAsistanı l1 = new LabAsistanı("Eren Ayrı", "01324654", "eren@patika.dev", "IT", "Asistan", "12-15");
        l1.lablaraGir();

        o1.giris("10.00");
        //Method overlodading - Methodlarda aşırı yüklenme
        o1.giris("10.00","18.00");
        a1.giris();

        //Method Overriding - Metotlarda Geçersiz Kılma
        o1.giris();
    }
}
