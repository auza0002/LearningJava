package JavaChallenges;

public class MakeNegative {
    /*
    In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
Examples
Kata.makeNegative(1);  // return -1
Kata.makeNegative(-5); // return -5
Kata.makeNegative(0);  // return 0
Notes
The number can be negative already, in which case no change is required.
Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
     */
    public static void main(String[] args) {
        System.out.println(makeNegative(1));
//        System.out.println(makeNegative(-1));
//        System.out.println(makeNegative(0));
    }
    public static int makeNegative(int number){
        int negativeNumber  = -1;
     if(number < 0 ){
         System.out.println("this number is not negative");
         return number ;

     } else if(number > 0 ){
         System.out.println("this number is positive");
         return number * negativeNumber;
     }else  {
         System.out.println("this number is 0");
         return number;
     }

    }
}
