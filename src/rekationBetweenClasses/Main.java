package rekationBetweenClasses;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Muhittin", "Ayrı", "1", "Ümraniye", 100);
        Student st2 = new Student("Mehmet", "Ayrı", "2", "Kadıköy", 100);
        Student st3 = new Student("Ali", "Ayrı", "3", "Çakmak", 100);
        //st2.setNote(100);
        //System.out.println(st2.getNote());


        Instructor teacher = new Instructor("Mahmut", "Çetindağ", "CENG");

        // Kalıtım (Inheritance) -> is a

        // Composition , Aggretation
        //Course has a Instructor -> Sınıfın bir öğretmeni vardır.
        Course mat = new Course("Mat101", "MAT", teacher);

        System.out.println(mat.getInstructor().getName());

        //Student[] stu = {st1,st2,st3};
        //System.out.println("Ortalama : " +  mat.calcAvarage(stu));
    }
}
