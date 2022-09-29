package exception;

import java.util.Scanner;

public class ThrowExample {

    public static void checkAge(int age) throws Exception {
        if (age < 18){
            throw new Exception("Yaşınız Tutmuyor");
        }
        System.out.println("Yaşınız Uygundur.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı Giriniz : ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaşı uymadı");
            System.out.println(e.toString());
        }

        System.out.println("Program Bitti !");
    }
}
