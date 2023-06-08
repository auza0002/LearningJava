package Loop;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        System.out.println(" The total of the sum between 1 and 1000 inclusive is :" + Sum3And5Challenge(1, 1000));
    }
    public static int Sum3And5Challenge(int firstNumber , int secondNumber){
        int totalSum = 0;
        int numbersFound = 0;
        if(firstNumber >= 1 && secondNumber <= 1000){
            for (int i = firstNumber; i < secondNumber; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    totalSum += i;
                    numbersFound++;
                    System.out.println(" a number matching the parameter was found : " + i);
                    if(numbersFound == 5){
                        System.out.println(" The maximum numbers is 5 - Exiting for loop");
                        break;
                    }
                }
            }
        }
        return totalSum;
    }
}
