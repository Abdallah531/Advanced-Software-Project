package uuu;
public class VodafoneInternetPayment extends InternetPayment{

    @Override
    public String toString() {
        return "VodafoneInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
