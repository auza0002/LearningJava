package Cylinder;

public class Cylinder extends Circle{
    private double  height;

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }
}