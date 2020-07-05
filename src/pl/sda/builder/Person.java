package pl.sda.builder;

public class Person {

    private String name;
    private String surname;
    private String address;
    private int age;
    private  int height;

    public Person(){

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static class Builder{

        private Person person = new Person();

        public Builder withName(String name){
            person.setName(name);
            return this;
        }

        public Builder withSurname(String surname){
            person.setSurname(surname);
            return this;
        }

        public Builder withAddress(String address){
            person.setAddress(address);
            return this;
        }

        public Builder withAge(int age){
            person.setAge(age);
            return this;
        }

        public Builder withHeight(int height){
            person.setHeight(height);
            return this;
        }

        public Person build(){
            //metoda swap
            Person copy = person;

            person= new Person();  //reset

           return copy;
        }

    }
}
