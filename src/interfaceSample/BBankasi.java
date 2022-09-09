package interfaceSample;

public class BBankasi implements IBanka {
    private String bankaAdi;
    private String terminalId;
    private String password;

    public BBankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    /*
    public void conn(String str){
        System.out.println(this.bankaAdi + " Bağlanıldı.");
    }

    public void sendPayment(double price){
        //Banka ödeme işlemleri
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem Başarılı oldu !");
    }
     */

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanici IP : " + ipAddress);
        System.out.println("Makina ip : " + this.hostIpAddress);
        System.out.println(this.bankaAdi + " Bağlanıldı.");
        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        //Banka ödeme işlemleri
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem Başarılı oldu !");
        return false;
    }
}
