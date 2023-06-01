package JavaChallenges;

public class secondsChallenge {
    public static void main(String[] args) {
//        1 minute is 60 seconds and one hour equals 60 minutes or 3600 seconds
        getDurationString(1, 12);
        getDurationString(4000);
    }
    public static void getDurationString(int seconds) {
        if(seconds >= 0){
           int  hoursResult = seconds / 3600;
           int  minutesResult =( seconds % 3600 ) / 60;
           int  secondsResult = ( seconds % 3600 ) % 60;
            System.out.println(hoursResult +"h " + minutesResult + "m " + secondsResult + "s " + "one input");
        } else {
            System.out.println(" the seconds input data is not valid");
        }

    }
    public static void getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds  <= 59){
            int totalSeconds = (minutes * 60 ) + seconds;
            int  hoursResult = totalSeconds / 3600;
            int  minutesResult =( totalSeconds % 3600 ) / 60;
            int  secondsResult = ( totalSeconds % 3600 ) % 60;
            System.out.println( hoursResult +"h " + minutesResult + "m " + secondsResult+ "s " + "two input");
        } else  {
            System.out.println("The input data is not valid try again.\n");
            System.out.println("the hour input should be greater than 0 and the seconds should be greater than 0 but less than 59");
        }
    }
}
