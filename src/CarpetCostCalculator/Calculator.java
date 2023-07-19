package CarpetCostCalculator;

public class Calculator {
    private Floor floor;
   private  Carpet carpet;
     public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
}
