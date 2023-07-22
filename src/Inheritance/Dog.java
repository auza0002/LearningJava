package Inheritance;

public class Dog extends Animal {
    public Dog(){
        super("Mutt", "Big", 500 );
    }
    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }
}
