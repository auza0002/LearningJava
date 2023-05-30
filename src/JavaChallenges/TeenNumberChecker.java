package JavaChallenges;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(checkNumber(9, 19, 99));
    }
    public static boolean checkNumber(int number1, int number2, int number3) {
        boolean result = false;
        if(( number1 <= 19 && number1 >= 13) || ( number2 <= 19 && number2 >= 13) || ( number3 <= 19 && number3 >= 13) ){
            result = true;
        }
        return result;
    }
    public static boolean isTeen(int number1){
        boolean result = false;

        if(number1 >= 13 && number1 <= 19){
            result = true;
        }
        return result;
    }
}
