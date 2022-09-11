package Example.InheritanceExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double krediTutari;
        int vadeSayisi, krediTuru;

        System.out.println("------------------");
        System.out.print("-> Almak İstediğiniz Kredi Tutarı: ");
        krediTutari = scanner.nextDouble();
        System.out.print("-> İstediğiniz Vade: ");
        vadeSayisi = scanner.nextInt();
        System.out.println("------------------\n-> Almak İstediğiniz Kredi Türü: \n1-> İhtiyaç Kredisi \n2-> Tarım Kredisi \n------------------");
        System.out.print("-> Kredi Türü: ");
        krediTuru = scanner.nextInt();

        IhtiyacKredisi ihtiyacKredisi = new IhtiyacKredisi(krediTutari, vadeSayisi);
        TarimKredisi tarimKredisi = new TarimKredisi(krediTutari, vadeSayisi);

        switch (krediTuru){
            case 1:
                System.out.println("------------------\n" + ihtiyacKredisi.krediBilgileri() + "\n------------------");
                break;
            case 2:
                System.out.println("------------------\n"+ tarimKredisi.krediBilgileri() + "\n------------------");
                break;
            default:
                System.out.println("------------------\n-> Tanımsız Bir Değer Girdiniz.\n------------------");
                break;
        }
    }

}
