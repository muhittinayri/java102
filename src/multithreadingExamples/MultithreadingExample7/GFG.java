package multithreadingExamples.MultithreadingExample7;

public class GFG extends Thread{
    @Override
    public void run(){
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        System.out.println("main thread priority : " + Thread.currentThread().getPriority());
        GFG t1 = new GFG();
        System.out.println("t1 thread priority : " + t1.getPriority());

        //https://www.geeksforgeeks.org/thread-pools-java/?ref=lbp
    }
}
