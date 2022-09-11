package Example.EncapsulationExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataBaseManager dataBaseManager = new DataBaseManager();
        String kullaniciAdi, dbName, dbPass;
        System.out.println("Merhaba!\nLütfen Kullanıcı Adını Girin: ");
        kullaniciAdi = scanner.nextLine();
        System.out.print("-----------------------\n-> Database İsmini Girin: ");
        dbName = scanner.nextLine();
        System.out.print("-> Database Şifresini Girin: ");
        dbPass = scanner.nextLine();

        if (dataBaseManager.getDbName().equals(dbName) && dataBaseManager.getDbPass().equals(dbPass)){
            dataBaseManager.setUserName(kullaniciAdi);
            dataBaseManager.dbLog();
        }else {
            System.out.print("\n-----------------------\n-> Hatalı Giriş Gerçekleştirdiniz.\n-----------------------");
        }
    }
}
