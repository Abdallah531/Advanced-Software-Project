package uuu;
public class Wallet extends Payment {
    @Override
    public String toString() {
        return "Wallet{}";
    }

    @Override
    public double cost() {
        return Cost;
    }
}
