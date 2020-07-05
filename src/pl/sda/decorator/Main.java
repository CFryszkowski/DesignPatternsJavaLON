package pl.sda.decorator;

public class Main {
    public static void main(String[] args) {

        AbstractPizza margherita = new MargheritaPizza();

        AbstractPizza pinaplePizza = new PinaplePizzaDecorator(margherita);

        System.out.println(pinaplePizza.getDescription());
        System.out.println(pinaplePizza.price());

    }
}
