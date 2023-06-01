package JavaChallenges;

public class InchesToCentimeters {
    public static void main(String[] args) {
    convertToCentimeters(68);
    convertToCentimeters(5 , 8);
    }
    public static double convertToCentimeters(int height){

        double centimeters = height * 2.54;
        System.out.println(centimeters);
        return centimeters;

    }

    public static double convertToCentimeters(int heightFeet, int heightInches){
            int totalFeetInInches = heightFeet * 12;
            int totalInches = (totalFeetInInches + heightInches);
            double totalInchesIntoCentimeters =  convertToCentimeters(totalInches);
            return totalInchesIntoCentimeters;
    }
}
