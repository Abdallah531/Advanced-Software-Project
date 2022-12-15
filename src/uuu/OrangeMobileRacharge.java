package uuu;

public class OrangeMobileRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "OrangeMobileRacharge{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
