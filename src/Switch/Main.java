package Switch;

public class Main {
    public static void main(String[] args) {

        int switchValue = 1 ;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            default -> System.out.println("the value was not 1 or 2");
        }
        String month = "APRIL";
        String month2 = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarters");
        System.out.println(month + " is in the " + getQuarter(month2) + " quarters");
    }

    public static String getQuarter( String month ){
        switch(month) {
                case "JANUARY":
                case "FEBRUARY":
                case "MARCH":
                    return "1st";
                case "APRIL":
                case "MAY":
                case "JUNE":

                    return "2nd";
                case "JULY":
                case "AUGUST":
                case "SEPTEMBER":
                    return "3rd";
                case "OCTOBER":
                case "NOVEMBER":
                case "DECEMBER" :
                    return "4th";
        }
        return "bad";
    }
}
