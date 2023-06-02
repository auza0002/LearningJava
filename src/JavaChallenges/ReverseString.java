package JavaChallenges;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("hello");
    }
    public static void reverseString(String string){
       String  result = new StringBuilder(string).reverse().toString();
        System.out.println(result);
    }
}
