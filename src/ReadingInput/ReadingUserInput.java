package ReadingInput;

public class ReadingUserInput {
    public static void main(String[] args) {
    int currentYear = 2023;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine(" Hi, What is your name?");
        System.out.println(" Hi " + name + ", This is muy first input from Console.");
        String DateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(DateOfBirth);
        return " So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){
        return "";
    }
}
