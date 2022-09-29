package exception;

import java.util.Scanner;

public class AgeCheckMain {

    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18){
            throw new AgeCheckException("Yaş Hatası Alındı !");
        }
        System.out.println("Yaşınız Uygundur.");
    }

    public static void main(String[] args) throws AgeCheckException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı Giriniz : ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        }catch (AgeCheckException e){
            System.out.println(e.toString());
        }

        System.out.println("Program Bitti !");
    }
}
