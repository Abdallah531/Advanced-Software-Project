package uuu;
public class Schools extends Donations {
    @Override
    public String toString() {
        return "Schools{}";
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
