package JavaChallenges;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123456));
        System.out.println(isPalindrome(-1221));
    }
    public static boolean  isPalindrome( int number){
        boolean result = false;
        int original = number;
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }

        if (original == reverse) {
            result =  true;
        }

        return result;

    }
}
