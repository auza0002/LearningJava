package ReadingInput;
import java.util.Scanner;

public class ReadingInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =1 ;
        int sum = 0;
        while (counter <= 5){
            System.out.println("Enter number #" + counter + ":");
            String nextNumber  = scanner.nextLine();
            try {
                int number  = Integer.parseInt(nextNumber);
                counter ++;
            } catch (NumberFormatException nfe){
                System.out.println("invalid number");
            }

        }
    }
}
