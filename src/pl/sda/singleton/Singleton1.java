package pl.sda.singleton;

public class Singleton1 {
//EAGER
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){

    }
    public void doSth(){
        System.out.println("Metoda biznesowa singleton 1");
    }
}
