package inheritanceSample;

public class LabAsistanı extends Asistan{
    public LabAsistanı(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + " lablara giriş yaptı !");
    }
}
