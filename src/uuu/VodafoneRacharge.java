package uuu;
public class VodafoneRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "VodafoneRacharge{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
