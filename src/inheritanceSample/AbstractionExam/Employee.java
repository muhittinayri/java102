package inheritanceSample.AbstractionExam;

public abstract class Employee extends Person{

    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public abstract float calculateSalary();

    /*
    Abstract yapısından faydalanılarak oluşturulan Employee sınıfı oluşturulacak diğer firma employee sınıflarına
    miras verilerek firmaya özel maaş hesaplama algoritmaları kullanılabilir.
     */
}
