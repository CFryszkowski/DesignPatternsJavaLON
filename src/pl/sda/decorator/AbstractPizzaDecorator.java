package pl.sda.decorator;

public abstract class AbstractPizzaDecorator extends AbstractPizza {

    protected AbstractPizza abstractPizza;

    public AbstractPizzaDecorator(AbstractPizza abstractPizza) {
        this.abstractPizza = abstractPizza;
    }
}
