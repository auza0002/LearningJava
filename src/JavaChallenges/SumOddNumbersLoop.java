package JavaChallenges;

public class SumOddNumbersLoop {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
    }
    public static boolean isOdd(int numberToCheck){
        boolean result = false;
        if(numberToCheck > 0){
            if(numberToCheck % 2 != 0){
                result = true;
            }
        }
        return result;
    }
    public static int sumOdd(int start, int end ){
        int totalSum = 0;
        if(end >= start && end > 0 && start > 0){
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    totalSum += i;

                }
            }
        } else {
           totalSum = -1;
        }
        return totalSum;
    }
}
