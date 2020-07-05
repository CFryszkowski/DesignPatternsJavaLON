package pl.sda.builder;

public class Main {

    public static void main(String[] args) {

        Person.Builder builder = new Person.Builder();

        Person person = builder
                .withName("Czarek")
                .withSurname("Fryszkowski")
                .withAddress("Londyn")
                .withAge(27)
                .withHeight(189)
                .build();

        System.out.println(person);

        Person person2 = builder
                .withHeight(185)
                .build();

        System.out.println(person2);
    }
}
