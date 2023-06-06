package JavaChallenges;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(-3.175,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(0.0,0.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.1757));
        System.out.println(areEqualByThreeDecimalPlaces(3.175655,3.175788));
        System.out.println(areEqualByThreeDecimalPlaces(3.275655,3.175788));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){

        int num1 = (int) Math.floor(numberOne * 1000);
        int num2 = (int) Math.floor(numberTwo * 1000);

        return num1 == num2;

    }


}
