package JavaChallenges;

public class totalSum {
    public static void main(String[] args) {
        System.out.println(compareSum(1,1,1));
    }
    public static boolean compareSum(int sum1, int sum2, int num3) {
        boolean result = false;

        int sumNumberOneTwo = sum1 + sum2;
        if(sumNumberOneTwo == num3){
            result = true;
        }
        return result;
    }
}
