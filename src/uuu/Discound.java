package uuu;
import java.util.LinkedList;

public abstract class Discound extends Payment {
    Payment payment;
    double cost=0.0;
    Services services;

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
