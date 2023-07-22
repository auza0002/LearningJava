package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal =  new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal , "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "Fast");

        Dog yorkey = new Dog("Yorkey", 15);
        doAnimalStuff(yorkey, "fast");
        Dog retriever =  new Dog("Labrador" , 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "super fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______");
    }
}
