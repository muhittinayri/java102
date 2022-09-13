package generic;

public class EmployeeManager <benimOzelTipim>{
    private final String sirketKisaltmasi = "COMP";
    benimOzelTipim maas;
    private String kayitNumarasi;
    String isim, soyisim;

    public String getKayitNumarasi(){
       int i = isim.length()/2+1;
       int v = soyisim.length()/2;
       this.kayitNumarasi = sirketKisaltmasi + "-" + isim.substring(i)+soyisim.substring(v);
       return kayitNumarasi.toUpperCase();
    }
}
