package pl.sda.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.INSTANCE;

        singleton1.doSth();

        Singleton2 singleton2 = Singleton2.getInstance();

        singleton2.doSth();

        LogWriterSingleton logWriterSingleton = LogWriterSingleton.getInstance();

        logWriterSingleton.log("Ala ma kota");
        logWriterSingleton.log("kot ma ale");

    }
}
