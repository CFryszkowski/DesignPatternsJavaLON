package pl.sda.decorator;

public class MargheritaPizza extends AbstractPizza  {

    public MargheritaPizza(){
        this.description ="sos";
    }

    @Override
    public double price() {
        return 15;
    }
}
