package generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListManager<Integer> studentNo = new ListManager<>();
        studentNo.addList(20306001);
        studentNo.addList(20306014);
        studentNo.addList(20306034);
        ListManager<String> studentName = new ListManager<>();
        studentName.addList("Yasin");
        studentName.addList("Rüzgar");
        studentName.addList("Metehan");

        ArrayList<Integer> schoolNo = studentNo.getList();
        ArrayList<String> studentInfo = studentName.getList();

        for (int i = 0; i < studentInfo.size(); i++){
            System.out.println("----------------\n< " + (i+1) + ". Öğrenci Bilgisi > \n----------------\n-> Öğrenci Numarası : " + schoolNo.get(i) + "\n-> Öğrenci İsmi : " + studentInfo.get(i));
        }
        System.out.println("----------------");
    }
}
