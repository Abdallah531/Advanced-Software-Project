package uuu;
public class EitsalatMobileRacharge extends MobileRacharge {
    @Override
    public String toString() {
        return "EitsalatMobileRacharge{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }


}
