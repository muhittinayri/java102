package Example.InterfaceExample;

public class MySqlDatabase implements IDatabase{

    @Override
    public void login() {
        System.out.println("-> MySql Veritabanına Bağlanıldı.");
    }

    @Override
    public void add() {
        System.out.println("-> Verilen İşlemler Mysql Veritabanına Kaydedildi.");
    }

    @Override
    public void delete() {
        System.out.println("-> Verilen İşlemler Mysql Veritabanından Silindi.");
    }

    @Override
    public void get() {
        System.out.println("-> İstenilen İşlemler Mysql Veritabanından Getirildi.");
    }

    @Override
    public void update() {
        System.out.println("-> İstenilen İşlemler Mysql Veritabanı Üzerinde Güncellendi.");
    }
}
