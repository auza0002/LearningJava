package JavaChallenges;

public class MinutesToYearsChallenge {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
     public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long yearResult = minutes /(43800 * 12);
            long minutesResult = minutes;
            long daysResult = minutes/1440;

            System.out.println(minutesResult +" min = "+ yearResult + "y and " + daysResult +"d");
        }
     }
}
