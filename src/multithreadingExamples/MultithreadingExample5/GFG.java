package multithreadingExamples.MultithreadingExample5;

public class GFG {
    public static void main(String[] args) {
        try {
            System.out.println("Entering info Deadlock");
            Thread.currentThread().join();
            System.out.println("This statement will never execute");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
