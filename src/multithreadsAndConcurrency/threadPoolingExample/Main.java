package multithreadsAndConcurrency.threadPoolingExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic = new OrderMatic();

        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
           pool.execute(oMatic);
        }

        System.out.println(oMatic.getOrderNo());
    }
}
