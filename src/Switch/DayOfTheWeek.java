package Switch;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String dayOfTheWeek0 = printDayOfTheWeek(0);
        String dayOfTheWeek1 = printDayOfTheWeek(1);
        String dayOfTheWeek2 = printDayOfTheWeek(2);
        String dayOfTheWeek3 = printDayOfTheWeek(3);
        String dayOfTheWeek4 = printDayOfTheWeek(4);
        String dayOfTheWeek5 = printDayOfTheWeek(5);
        String dayOfTheWeek6 = printDayOfTheWeek(6);
        String dayOfTheWeek7 = printDayOfTheWeek(7);
    }
    public static String printDayOfTheWeek(int day){
        switch (day) {
            case 0 -> System.out.println("input value " + day + " = "+ " SUNDAY");
            case 1 -> System.out.println("input value " + day + " = "+ " MONDAY");
            case 2 -> System.out.println("input value " + day + " = "+ " TUESDAY");
            case 3 -> System.out.println("input value " + day + " = "+ " WEDNESDAY");
            case 4 -> System.out.println("input value " + day + " = "+ " THURSDAY");
            case 5 -> System.out.println("input value " + day + " = "+ " FRIDAY");
            case 6 -> System.out.println("input value " + day + " = "+ " SATURDAY");
            default -> {
                System.out.println(day +  " is an invalid input value" + "Unknown day");
            }
        }

        return null;
    }
    public static String printWeekDay(int day ){
        if(day == 0){
            System.out.println();
        }
       return null;
    }
}
