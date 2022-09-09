package interfaceSample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String terminalID = "1231564646465";
        final String password = "12313313";

        System.out.print("Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.print("Kart No giriniz : ");
        String cardNumber = input.next();

        System.out.print("Son kullanım tarihi giriniz : ");
        String date = input.next();

        System.out.print("Güvenlik kodu giriniz : ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.print("Banka Seçiniz : ");

        int selectBank = input.nextInt();

        switch (selectBank){
            case 1 :
                ABankasi aPos = new ABankasi("A Bankası", "4645464654", "12313132");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,date,cvc);
                break;
            case 2 :
                BBankasi bPos = new BBankasi("B Bankası", "4645464654", "12313132");
                bPos.connect("asdsad");
                bPos.payment(price,cardNumber,date,cvc);
                break;
            default:
                System.out.println("Geçerli Banka Giriniz !");
        }

    }
}
