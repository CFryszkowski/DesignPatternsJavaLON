package pl.sda.decorator;

public abstract class AbstractPizza {

    protected String description;

    public abstract double price();

    public String getDescription() {
        return description;
    }
}
