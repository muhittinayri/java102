package multithreadingExamples.MultithreadingExample4;

public class Test extends Thread{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : " + t.getName());
        t.setName("Geeks");
        System.out.println("After name change : " + t.getName());

        System.out.println("Main thread priority : " + t.getPriority());
        t.setPriority(MAX_PRIORITY);
        System.out.println("Main thread new priority : " + t.getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }

        Thread ct = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("Child Thread");
                }
            }
        };
        System.out.println("Child thread priority : " + ct.getPriority());
        ct.setPriority(MIN_PRIORITY);
        System.out.println("Child thread new priority : " + ct.getPriority());
        ct.start();
    }

}
