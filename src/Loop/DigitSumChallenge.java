package Loop;


public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in numbers 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in numbers -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in numbers 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in numbers 54321 is " + sumDigits(54321));


    }
    public static int sumDigits(int numberGroup){
        if(numberGroup < 0) {
            return -1;
        }

        int sum = 0;
        while(numberGroup > 9) {
            sum += (numberGroup % 10);
            numberGroup = numberGroup / 10;
        }
        sum += numberGroup;
        return sum;
    }
}
