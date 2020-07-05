package pl.sda.factorymethod;

public class Tester extends Employee {


    public Tester(String name, String surname) {
        super(name, surname);
        this.type = EmployeeType.TESTER;
    }

    @Override
    public double calculateSalary() {
        return 8000;
    }
}
