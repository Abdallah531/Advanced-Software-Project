package uuu;
public class WEReachage extends MobileRacharge {
    @Override
    public String toString() {
        return "WEReachage{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
