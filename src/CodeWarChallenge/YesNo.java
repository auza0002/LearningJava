package CodeWarChallenge;

public class YesNo {
    // Complete the method that takes a boolean value and return a "Yes" string for true,  or a "No" string for false
    public static String boolToWord(boolean b){
        String  response = "No";
        if(b){
            response = "Yes";
        }
        return response;
    };

    public static void main(String[] args) {
        System.out.println(boolToWord(false));
        System.out.println(boolToWord(true));
    }

}
