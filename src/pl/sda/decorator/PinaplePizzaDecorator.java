package pl.sda.decorator;

public class PinaplePizzaDecorator extends  AbstractPizzaDecorator {

    public PinaplePizzaDecorator(AbstractPizza abstractPizza){
        super(abstractPizza);
    }

    @Override
    public double price() {
        return abstractPizza.price() + 4.0;
    }

    @Override
    public String getDescription(){
        return abstractPizza.getDescription() + ", ananas";
    }
}
