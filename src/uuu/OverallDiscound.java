package uuu;

import java.util.LinkedList;

public class OverallDiscound extends  Discound {
    private static OverallDiscound obj;

    double DiscoundAmmount=0;

    OverallDiscound(Payment payment){
        this.payment=payment;

    }
    public static OverallDiscound getOverallDiscound(double v){
        if(OverallDiscound.obj==null) {
            obj = new OverallDiscound(v);
        }

        return OverallDiscound.obj;
    }
    private OverallDiscound(double value){

        DiscoundAmmount=value;
    }


    @Override
    public double cost() {
        return this.getPayment().cost() -DiscoundAmmount;
    }




    public double getDiscoundAmmount() {
        return DiscoundAmmount;
    }

    public void setDiscoundAmmount(double discoundAmmount) {
        DiscoundAmmount = discoundAmmount;
    }
}
