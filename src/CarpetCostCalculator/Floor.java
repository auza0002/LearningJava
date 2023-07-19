package CarpetCostCalculator;

public class Floor {
     private double width;
     private double length;


    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Floor(double width, double length) {
        if(width > 0){
            this.width = width;
        }else {
            this.width = 0;
        }
        if(length > 0){
            this.length = length;
        } else {
            this.length = 0;
        }
    }
    public double getArea(){
        double total = this.length * this.width;
        return total;
    }

}

