package uuu;
import java.util.LinkedList;

public class specificDiscound extends Discound {
    double ammount;
    Services services;
    protected static LinkedList<Discound> discounds=new LinkedList<Discound>();

    public LinkedList<Discound> getDiscounds() {
        return discounds;
    }

    public void setDiscounds(LinkedList<Discound> discounds) {
        this.discounds = discounds;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    specificDiscound(double Value, Services services){

       ammount=Value;
       this.services=services;
        discounds.add(this);
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    @Override
    public double cost() {
        return this.getPayment().cost()-ammount ;
    }
}
