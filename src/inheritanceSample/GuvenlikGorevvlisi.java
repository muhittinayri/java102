package inheritanceSample;

public class GuvenlikGorevvlisi extends Memur{
    private String belge;

    public GuvenlikGorevvlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }

    public void nobet(){
        System.out.println(this.getAdSoyad() + " nobet tutuyor !");
    }
}
