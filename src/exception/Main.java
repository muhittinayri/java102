package exception;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program başladı !");
        int a = 0;
        int b = 20;
        try {
            System.out.println(b / a);
        }catch (Exception e){
            System.out.println("Hata Yakalandı ! ");
        }
        System.out.println("Program bitti !");
    }
}
