package pl.sda.singleton;

public class Singleton2 {
//LAZY LOADING, THREAD-SAFE
    private static volatile Singleton2 instance;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        if (instance==null){

            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public void doSth() {
        System.out.println("Metoda biznesowa singleton 2");
    }
}
