package CodeWarChallenge;
//The Story:
//Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so many
// passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus!
// He wants you to write a simple program telling him if he will be able to fit all the passengers.
//Task Overview:
//        You have to write a function that accepts three parameters:
//
//        cap is the amount of people the bus can hold excluding the driver.
//        on is the number of people on the bus excluding the driver.
//        wait is the number of people waiting to get on to the bus excluding the driver.
public class BobBusProblems {
    public static void main(String[] args) {
        System.out.println(enough(10, 5, 5));
        System.out.println(enough(100, 60, 50));
        System.out.println(enough(20, 5, 5));
    }
    public static int enough(int cap, int on, int wait){
        // your code here
        int response  = 0;
        int totalPeople = on + wait;
        if(cap < totalPeople){
           response =    totalPeople -  cap;
        }
        return response;

    }

}
