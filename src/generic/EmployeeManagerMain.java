package generic;

public class EmployeeManagerMain {
    public static void main(String[] args) {
        EmployeeManager<Integer> calisan = new EmployeeManager<>();
        calisan.isim = "Mustafa Enes";
        calisan.soyisim = "Barut";
        calisan.maas = 5000;
        EmployeeManager<Double> muhendis = new EmployeeManager<>();
        muhendis.isim = "Metehan";
        muhendis.soyisim = "Durmuş";
        muhendis.maas = 8575.50;

        System.out.println("----------------\n< Çalışan Bilgileri >\n----------------\n-> Çalışanın İsmi: "+calisan.isim+"\n-> Çalışanın Soyismi: "+calisan.soyisim+"\n-> Maaşı: "+calisan.maas+"\n-> Kayıt Numarası: "+calisan.getKayitNumarasi());
        System.out.println("----------------\n< Mühendis Bilgileri >\n----------------\n-> Mühendis İsmi: "+muhendis.isim+"\n-> Mühendis Soyismi: "+muhendis.soyisim+"\n-> Maaşı: "+muhendis.maas+"\n-> Kayıt Numarası: "+muhendis.getKayitNumarasi()+"\n----------------");

    }
}
