package inheritanceSample;

public abstract class Calisan {
    private String adSoyad;
    private String telefon;
    private String eposta;

    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris(){
        System.out.println(this.getAdSoyad() + " Üniversiteye giriş yaptı !");
    }

    /*
    //Method overlodading - Methodlarda aşırı yüklenme
    public void giris(String girisSaati){
        System.out.println(this.getAdSoyad() + " " + girisSaati + " saatinde üniversiteye giriş yaptı !");
    }

    //Method overlodading - Methodlarda aşırı yüklenme
    public void giris(String girisSaati, String cikisSaati){
        System.out.println(this.getAdSoyad() + " " + girisSaati + " saatinde üniversiteye giriş yaptı ve " + cikisSaati + " bu saatte çıkacaktır !");
    }
    */

    public void cikis(){
        System.out.println(this.getAdSoyad() + " Üniversiteden çıkış yaptı !");
    }

    public void yemekhane(){
        System.out.println(this.getAdSoyad() + " Yemekhaneye girdi !");
    }

    public static void girisYapanlar(Calisan[] loginUsers){
        for (Calisan c : loginUsers) {
            c.giris();
        }
    }
}
