package Switch;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(9);
        printWeekDay(0);
        printWeekDay(9);
    }
    public static void printDayOfTheWeek(int day){
       String dayOfTheWeek =  switch (day) {
            case 0 -> { yield  "SUNDAY";}
            case 1 -> { yield  "MONDAY";}
            case 2 -> { yield  "TUESDAY";}
            case 3 -> { yield  "WEDNESDAY";}
            case 4 -> { yield  "THURSDAY";}
            case 5 -> { yield  "FRIDAY";}
            case 6 -> { yield  "SATURDAY";}
            default -> {
                yield "invalid input day";
            }
        };
        System.out.println(day + " instance for " + dayOfTheWeek);

    }
    public static void printWeekDay(int day ){
        String dayOfTheWeek = "invalid input day";
        if(day == 0){
           dayOfTheWeek = "SUNDAY";
        }else if(day == 1){
            dayOfTheWeek = "MONDAY";
        } else if(day == 2){
            dayOfTheWeek = "TUESDAY";

        }else if(day == 3){
            dayOfTheWeek = "WEDNESDAY";
        } else if(day == 4){
            dayOfTheWeek = "THURSDAY";
        } else if(day == 5){
            dayOfTheWeek = "FRIDAY";
        } else if( day == 6){
            dayOfTheWeek = "SATURDAY";
        } else {
            dayOfTheWeek = "invalid input day";
        }
        System.out.println(day + " instance for " + dayOfTheWeek);
    }
}
