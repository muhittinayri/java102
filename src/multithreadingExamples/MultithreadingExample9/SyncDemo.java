package multithreadingExamples.MultithreadingExample9;

public class SyncDemo {
    public static void main(String[] args) {
        Sender sender = new Sender();
        ThreadedSend s1 = new ThreadedSend(" Hi " , sender);
        ThreadedSend s2 = new ThreadedSend(" Bye ", sender);
        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        }catch (Exception e){
            System.out.println("Interrupted");
        }

        //https://www.geeksforgeeks.org/method-block-synchronization-java/?ref=lbp
    }
}
