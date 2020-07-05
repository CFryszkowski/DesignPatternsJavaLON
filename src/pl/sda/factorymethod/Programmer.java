package pl.sda.factorymethod;

public class Programmer extends Employee {

    public Programmer(String name, String surname) {
        super(name, surname);
        this.type = EmployeeType.PROGRAMMER;
    }

    @Override
    public double calculateSalary() {
        return 10000;
    }
}
