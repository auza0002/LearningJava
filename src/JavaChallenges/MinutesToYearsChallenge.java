package JavaChallenges;

public class MinutesToYearsChallenge {
    public static void main(String[] args) {
        printYearsAndDays(1440);
        printYearsAndDays(525600);
    }

//    Be extra careful about spaces in the printed message.
//
//    Use the remainder operator
//
//      1 hour = 60 minutes
//
//      1 day = 24 hours
//
//      1 year = 365 days
     public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long yearResult = (minutes /1440)/365;
            long minutesResult = minutes;
            long daysResult = (minutes /1440)%365;

            System.out.println(minutesResult +" min = "+ yearResult + "y and " + daysResult +"d");
        }
     }
}
