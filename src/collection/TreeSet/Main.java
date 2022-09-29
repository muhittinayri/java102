package collection.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator().reversed());
        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Behlül", 45));
        students.add(new Student("Damla", 60));
        students.add(new Student("Damla", 60));
        students.add(new Student("Cemre", 60));

        for (Student stu : students){
            System.out.println(stu.getName());
        }
    }
}
/*
Veri kümesine konulan elemanların verdiğiniz kurala göre sıralanmasını sağlar. Bunun sağlanabilmesi için
kullanacağınız sınıfın “sıralanabilir” olması gerekmektedir. Bir sınıfın sıralanabilir olması için “Comparable”
interface’den kalıtım alıp “compareTo” metodunu doldurması gerekmektedir. Nesne üzerindeki “compareTo” fonksiyonu
küçükten büyüğe doğal sıralama imkanı sağlar.
 */