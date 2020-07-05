package pl.sda.factorymethod;

public class Architect extends Employee {


    public Architect(String name, String surname) {
        super(name, surname);
        this.type = EmployeeType.ARCHITECT;
    }

    @Override
    public double calculateSalary() {
        return 20000;
    }
}
