package CarpetCostCalculator;

public class Carpet {
    private  double cost;

    public double getCost() {
        return cost;
    }

    public Carpet(double cost) {
        if(cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }
}
