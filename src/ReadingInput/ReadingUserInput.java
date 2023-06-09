
package ReadingInput;
import java.util.Scanner;
public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2023;
       try {
           System.out.println(getInputFromConsole(currentYear));
       } catch (NullPointerException e){
           System.out.println(getInputFromScanner(currentYear));
       }

    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine(" Hi, What is your name?");
        System.out.println(" Hi " + name + ", This is muy first input from Console.");
        String DateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(DateOfBirth);
        return " So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi , What is your name?");
        String name = scanner.nextLine();
        System.out.println(" Hi " + name + ", This is muy first input from Console.");

        System.out.println("What year were you born");
        String DateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(DateOfBirth);

        return " So you are " + age + " years old";
    }
    public static int checkData( int currentYear, String dataOfBirth){
        int dob = Integer.parseInt(dataOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return (currentYear -dob);
    }
}
