package PoolArea;

public class Rectangle {

   private double length;
   private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return length * width;
    }
    public Rectangle(double width, double length) {
        if(width < 0){
            width = 0;
        }
        if(length < 0){
            length = 0;
        }
        this.length = length;
        this.width = width;
    }
}
