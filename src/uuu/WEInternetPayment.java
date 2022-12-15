package uuu;
public class WEInternetPayment extends InternetPayment{
    @Override
    public String toString() {
        return "WEInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
