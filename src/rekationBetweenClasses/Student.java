package rekationBetweenClasses;

public class Student {
    private String name;
    private String surname;
    private String idno;
    private String address;
    private int note;

    public Student(String name, String surname, String idno, String address, int note) {
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.address = address;
        if (note > 100 || note < 0){
            note = 0;
        }
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdno() {
        return idno;
    }

    public String getAddress() {
        return address;
    }

    public int getNote() {
        return note;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNote(int note) {
        if (note > 100 || note < 0){
            note = 0;
        }
        this.note = note;
    }

    public double calcAvarage(Student[] students){
        double avarage = 0.0;
        for (Student student : students) {
            avarage += student.getNote();
        }
        return avarage / students.length;
    }
}
