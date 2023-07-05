package OOP;

public class Main {
    public static void main(String[] args){
        Car car  = new Car();
        car.setMake("porsche");
        car.setModel("new porsche");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");
        // describe the car
        car.describeCar();

        Car targa = new  Car();
        targa.setMake("holden");
        targa.setModel("new targe");
        targa.setDoors(4);
        targa.setConvertible(false);
        targa.setColor("red");
        // describe the car
        targa.describeCar();
    }
}