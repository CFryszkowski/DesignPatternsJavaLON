package pl.sda.factorymethod;

public class Main {
    public static void main(String[] args) {

        Employee programmer = EmployeeFactory.createEmployee("Czarek","Fryszkowski",EmployeeType.PROGRAMMER);
        Employee tester = EmployeeFactory.createEmployee("Magda","Kapciak",EmployeeType.TESTER);
        Employee architect =EmployeeFactory.createEmployee("Anna","Kowalska",EmployeeType.ARCHITECT);

        Employee employeeList[]={programmer,architect,tester};

        for (Employee employee: employeeList){
            System.out.println(employee.getName()+" "+employee.getSurname()
                    +" jako  "+ employee.type + " zarabia: "+employee.calculateSalary());
        }

    }
}
