package multithreadsAndConcurrency.thrreadExample;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Uygulama Başladı");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Uygulama Bitti");
    }
    */

        Counter c1 = new Counter("Counter-1");
        Counter c2 = new Counter("Counter-2");
        c1.start();
        c2.start();
        //c1.run();
        //c2.run();

    }
}
