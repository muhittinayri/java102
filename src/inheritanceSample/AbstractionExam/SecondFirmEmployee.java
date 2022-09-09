package inheritanceSample.AbstractionExam;

public class SecondFirmEmployee extends Employee{

    private static final int CONST_ALES = 2;
    private static final int CONST = 10000;

    public static void main(String[] args) {
        SecondFirmEmployee secondFirmEmployee = new SecondFirmEmployee();
        secondFirmEmployee.setId(1);
        secondFirmEmployee.setName("Ali");
        secondFirmEmployee.setSurname("Ayrı");
        secondFirmEmployee.setJobTitle("PHP");

        System.out.println(secondFirmEmployee.getName() + " " + secondFirmEmployee.getSurname());
        System.out.println(secondFirmEmployee.getJobTitle());
        System.out.println(secondFirmEmployee.calculateSalary() + " TL");
    }

    @Override
    public float calculateSalary() {
        return CONST * (CONST_ALES * 0.75f);
    }
}
