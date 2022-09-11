package Example.InterfaceExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseManager databaseManager;
        int karar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------\n< Interface Kullanımı >\n-----------------");
        System.out.print("[1] - MysqlDatabase Bağlan\n[2] - OracleDatabase Bağlan\n-----------------\n-> Kararınız:");
        karar = scanner.nextInt();

        switch (karar){
            case 1:
                databaseManager = new DatabaseManager(new MySqlDatabase());
                System.out.println("-----------------");
                databaseManager.loginDatabase();
                System.out.println("-----------------");
                databaseManager.selectMenu();
                break;
            case 2:
                databaseManager = new DatabaseManager(new OracleDatabase());
                System.out.println("-----------------");
                databaseManager.loginDatabase();
                System.out.println("-----------------");
                databaseManager.selectMenu();
                break;
            default:
                System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
                break;
        }
    }
}
