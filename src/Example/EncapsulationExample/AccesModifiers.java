package Example.EncapsulationExample;

public class AccesModifiers {
    // Public Metot ve Değişken Tanımlaması
    public String webSite = "www.google.com.tr";
    public String mySite(){
        return "Web Adresim : ";
    }

    // Protected Metot ve Değişken Tanımlama
    protected String myName = "Muhittin";
    protected String mySurname(){
        return "AYRI";
    }

    //Default Metot ve Değişken Tanımlama
    String birMerhaba = "Merhaba !";
    int myAge(){
        return 24;
    }

    //Private Metot ve Değişken Tanımlama
    private String secretMail = "ayri.muhittin@gmail.com";
    private void secretMethod(){
        System.out.println("Private Metot Erişim Sağlandı");
    }
}
