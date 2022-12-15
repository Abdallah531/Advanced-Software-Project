package uuu;

public class OrangeInternetPayment extends InternetPayment{
    @Override
    public String
    toString() {
        return "OrangeInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
