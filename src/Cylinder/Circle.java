package Cylinder;

public class Circle {
    private double radius;
    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (  Math.pow(radius,  2) * Math.PI);
    }
    public  Circle(double radius) {
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }
}
