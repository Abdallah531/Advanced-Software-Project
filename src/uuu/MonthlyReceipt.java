package uuu;

public class MonthlyReceipt extends Landline {
    @Override
    public String toString() {
        return "MonthlyReceipt{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
