package uuu;
public class EtisalatInternetPayment extends InternetPayment{
    @Override
    public String toString() {
        return "EtisalatInternetPayment{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
