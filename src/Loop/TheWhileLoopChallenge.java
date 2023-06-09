package Loop;

public class TheWhileLoopChallenge {
    public static void main(String[] args) {
        int counter = 0;
        int totalEvenNumbers = 0;
        int totalOddNumbers = 0;
        int numberRangesStart = 5;
        int numberRangesEnd = 39;

            while(numberRangesStart <= numberRangesEnd){
               if(counter >= 5 ){
                   break;
               }
               if(isEvenNumber(numberRangesStart)){
                   counter++;
                   totalEvenNumbers ++;
                   System.out.println(" Even number found,  number found : " + numberRangesStart);

               } else {
                   totalOddNumbers ++;
               }
               numberRangesStart ++;
            }
        System.out.println(" total even numbers: " + totalEvenNumbers);
        System.out.println(" total odd numbers: " + totalOddNumbers);
    }
    public static boolean isEvenNumber(int number){
        boolean response = false;
        if(number % 2 == 0){
            response = true;
        }
        return response;
    }
}
