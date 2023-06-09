package Loop;

public class TheWhileLoopChallenge {
    public static void main(String[] args) {
            int numberRangesStart = 5;
            int numberRangesEnd = 20;
            while(numberRangesStart <= numberRangesEnd){
                if(isEvenNumber(numberRangesStart)){
                    System.out.println(numberRangesStart);
                }
                numberRangesStart++;
            }
    }
    public static boolean isEvenNumber(int number){
        boolean response = false;
        // its purpose is to determine if the argument passed to the method is an even number or not.
        // return true from the method, if it is an even number, otherwise return false.
        // Next, use a while loop to test a range of numbers, from 5, up to 20 and including 20, but printing out
        //only the even numbers, determined by the call to the isEvenNumber method.
        if(number % 2 == 0){
            response = true;
        }
        return response;
    }
}
