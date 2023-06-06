package Switch;


public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1));
    }
    public static boolean isLeapYear(int isLeapYear) {
        boolean response = false;
        if(isLeapYear >= 1 && isLeapYear <= 9999){
            response = true;
        }
        return response;
    }
}
