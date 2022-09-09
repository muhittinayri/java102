package inheritanceSample.AbstractionExam;

public class Person {

    /*
     Person.java sınıfı içerisinde bir kişiye ait isim, soyisim ve id bilgileri tutulmaktadır.
     */

    private int id;
    private String name;
    private String surname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /*
    Employee.java sınıfı ise her Employee(Çalışan) bir Person(kişi) olacağı için Person sınıfı ile genişletilmiş
    olup bu sınıfı miras almıştır. Fakat her firmanın çalışan maaşını farklı hesapladığı bir algoritması olduğu
    düşünüldüğünde Employee sınıfı içerisinde tek bir metot yazılıp tüm firmalar için çalışması beklenemez.
    Bu gibi durumlarda superclass abstraction yapısından faydalanılarak miras alındığı sınıflar için farklı
    davranışlar sergileyebilir.
     */
}
