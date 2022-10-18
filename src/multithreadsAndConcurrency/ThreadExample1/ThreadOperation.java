package multithreadsAndConcurrency.ThreadExample1;

import java.util.ArrayList;

public class ThreadOperation extends Thread{
    private ArrayList<Integer> cift = new ArrayList<>();
    private ArrayList<Integer> tek = new ArrayList<>();
    private ArrayList<Integer> genel = new ArrayList<>();

    public ThreadOperation(ArrayList<Integer> genel) {
        this.genel = genel;
    }

    @Override
    public void run(){
        for (int i = 0; i < genel.size(); i++) {
            if (genel.get(i) % 2 == 0){
                cift.add(genel.get(i));
            }else {
                tek.add(genel.get(i));
            }
        }
        printTek();
        printCift();
    }

    public synchronized void printTek(){
        System.out.println(this.tek);
    }

    public synchronized void printCift(){
        System.out.println(this.cift);
    }


}
