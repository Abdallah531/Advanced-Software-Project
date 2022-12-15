package uuu;
public class QuarterReceipt extends Landline {
    @Override
    public String toString() {
        return "QuarterReceipt{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
