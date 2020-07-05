package pl.sda.factorymethod;

public class EmployeeFactory {

    public static Employee createEmployee(String name, String surname,EmployeeType type){

        switch (type){
            case TESTER: return new Tester(name,surname);
            case ARCHITECT: return new Architect(name,surname);
            case PROGRAMMER: return new Programmer(name,surname);
            default:
                throw new  IllegalArgumentException("Unexpected value: "+type);
        }

    }

}
