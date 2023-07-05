package OOP;

public class Car {
    private String make = "Tesla" ;
    private String model = "Model X" ;
    private String color = "Red";
    private int doors;
    private boolean convertible;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar(){
        System.out.println(doors + " -Door " +
                color + " "+
                make + " "+
                model + " "+
                (convertible ? " Convertible" : "no-Convertible"));
    }
}
