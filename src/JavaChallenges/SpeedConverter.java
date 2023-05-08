package JavaChallenges;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(-10);
        printConversion(0.0000);
        printConversion(400.45);
        printConversion(75.677);
    }
    public static void printConversion(double kilometersPerHour){
        long conversion =  toMilesPerHour(kilometersPerHour);
        if(conversion > -1 ){
            System.out.println( kilometersPerHour + "km/h" + " = " + conversion + "mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour){
        // 1kph  =  0.62mlong  kilometersPerHourResult;
        long kilometersPerHourResult;
        if(kilometersPerHour >= 0){
            kilometersPerHourResult =  (long)(kilometersPerHour * 0.621371);
        } else {
            kilometersPerHourResult = -1;
        }
        return Math.round(kilometersPerHourResult);
    }
}
