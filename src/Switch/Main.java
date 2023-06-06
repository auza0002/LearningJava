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
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        };
    }
}
