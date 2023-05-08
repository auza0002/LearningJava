package JavaChallenges;

public class BarkingDog {

    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
         boolean shouldWake ;
       if(barking){

           if(hourOfDay < 0 || hourOfDay > 23 ) {
              return  shouldWake = false;
           }
           if(hourOfDay < 8 || hourOfDay > 22){
               return  shouldWake = true;
           }
       } return shouldWake = false ;

    }

}
