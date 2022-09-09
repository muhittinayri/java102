package inheritanceSample.AbstractionExam;

public class FirstFirmEmployee extends Employee{

    private static final int CONST_ALES = 2;
    private static final float CONST_UNI = 0.3f;
    private static final int CONST = 10000;

    public static void main(String[] args) {
        FirstFirmEmployee firstFirmEmployee = new FirstFirmEmployee();
        firstFirmEmployee.setId(1);
        firstFirmEmployee.setName("Muhittin");
        firstFirmEmployee.setSurname("AYRI");
        firstFirmEmployee.setJobTitle("Java Uzmanı");

        System.out.println(firstFirmEmployee.getName() + " " + firstFirmEmployee.getSurname());
        System.out.println(firstFirmEmployee.getJobTitle());
        System.out.println(firstFirmEmployee.calculateSalary() + " TL");
    }

    @Override
    public float calculateSalary() {
        return CONST * (CONST_ALES / CONST_UNI);
    }
}
