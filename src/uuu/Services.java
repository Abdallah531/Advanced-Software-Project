package uuu;

import java.util.ArrayList;

public abstract class Services {

    //    String NameServices;
////    MobileRacharge mobileRacharge;
////    InternetPayment internetPayment;
////    Landline landline;
////    Donations donations;
//    ArrayList<Services> list=new ArrayList<Services>();
//    String company;
//
    ArrayList<String> StoreServices=new ArrayList();
    abstract public void addToStore();


    public double Cost=500;

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }
}
