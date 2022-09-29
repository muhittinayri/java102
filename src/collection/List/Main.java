package collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(null);
        liste.add(4);
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(5);

        /*
        Iterator<Integer> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(liste);

        for (Integer element : liste){
            System.out.println(element);
        }
        */

        System.out.println(liste.size());
        System.out.println(liste.get(3));
        System.out.println(liste.indexOf(null));
        System.out.println(liste.lastIndexOf(1));
        System.out.println(liste.lastIndexOf(15));
        liste.add(2,15);
        liste.add(2,15);
        System.out.println(liste.contains(10));
        System.out.println(liste.contains(1550));
        System.out.println(liste.remove(1));
        //liste.clear();

        System.out.println("************************* Liste *************************");
        for (Integer element : liste){
            System.out.println(element);
        }

        System.out.println("*************************  *************************");

        List<Integer> liste2 = new ArrayList<>();
        liste.add(36);
        liste2.addAll(0,liste);
        System.out.println(liste2);


        System.out.println("*************************  *************************");

        List<Integer> liste3 = liste.subList(2, 4);
        System.out.println(liste3);

        System.out.println("*************************  *************************");


        Object[] objectArr = liste.toArray();
        Integer[] str = liste.toArray(new Integer[0]);
        System.out.println(str[0]);


    }

}
