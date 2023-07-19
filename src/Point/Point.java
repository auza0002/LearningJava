package Point;

public class Point {
    // you have to represent a point in 2D space. Write a class with the name Point
    // The class need two fields ( instance variables  ) with the name x and y.
    // The class need to have to constructors. The first constructor does not have parameter
    // The second constructor has parameters x and y it need to initialize the fields.

    private int x;
    private int y;
    public Point(){
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance (){
        // it needs to return the distance between the 2 points 0.0 as double
        int i = 0;
        double distance = Math.sqrt(((x - i) * (x - i)) + ((y - i ) * (y - i)));
        return distance;
    }
    public double distance (int x, int y){
        // it needs to return the distance between Point and Point x, y as double
        double distance = 0;
        return distance;
    }

}
