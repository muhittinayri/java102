package rekationBetweenClasses;

public class Course {
    private String courseName;
    private String code;
    private Instructor instructor;

    public Course(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    // Course uses a Student -> Course Sınıfı Student Sınıfına bağlı
    public double calcAvarage(Student[] students){
        Student st4 = new Student("Gönül", "Ayrı", "1", "Ümraniye", 100);
        double avarage = 0.0;
        for (Student student : students) {
            avarage += student.getNote();
        }
        return avarage / students.length;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
