package uuu;
public abstract class Payment {
     protected double Cost;

     public abstract double cost();

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }
}
