package uuu;
public class CancerHospital extends Donations {
    String number;
    int amount;

    public CancerHospital() {
        this.toString();
    }

    @Override
    public String

    toString() {


        System.out.println( "CancerHospital{" +
                "number='" + number + '\'' +
                ", amount=" + amount +
                '}');
        return null;
    }

    @Override
    public void addToStore() {
        StoreServices.add(toString());
    }
}
