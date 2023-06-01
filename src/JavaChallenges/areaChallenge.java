package JavaChallenges;

public class areaChallenge {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5, 4));
    }
    public static double area (double radius){
        double result = -1;
        if(radius >= 0 ){
            result = Math.pow(radius, 2) * Math.PI;
            return result;
        }
        return result;

    }
    public static double area ( double x, double y){
        double result = -1;
        if (x > 0 &&  y > 0) {
            result = x * y;
        }
        return result;
    }
}
