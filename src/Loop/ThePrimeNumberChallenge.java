package Loop;

public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
//
        checkRangePrimeNumber(10, 50);

    }
    public static int checkRangePrimeNumber(int numberStart, int numberEnd){
        int counterNumber = 0;
            if(numberEnd <= 1000 && numberStart >= 1){
                for (int i = numberStart; i <= numberEnd; i++){

                       if(isPrime(i)){
                           counterNumber ++;
                           System.out.println("a prime number was found : " + i + " , the counter is " + counterNumber);
                           if(counterNumber == 3){
                               System.out.println("Found the  maximum number of prime numbers :" + counterNumber);
                               break;
                           }
                       }

                }
            } else {
                System.out.println("The Numbers must be between 1 and 1000, try with another range of numbers" + ", " + numberStart + " and " + numberEnd);
            }
        return counterNumber;
    }


    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for(int divisor = 2; divisor <= wholeNumber / 2; divisor ++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}

