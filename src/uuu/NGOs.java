package uuu;

public class NGOs extends Donations {
    @Override
    public String toString() {
        return "NGOs{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
