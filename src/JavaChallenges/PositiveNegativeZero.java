package JavaChallenges;


public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(32);
        checkNumber(-5444);
        checkNumber(0);
    }
    public static void checkNumber(int checkParam){
        String checkResult;
        if(checkParam > 0 ){
            checkResult = "positive";
        } else if(checkParam < 0 ){
            checkResult = "negative";
        } else {
            checkResult = "zero";
        };
        System.out.println(checkResult);
    };
}
