package AllAboutStrings;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/22/1983";
        int startingIndex = birthDate.indexOf("1983");
        System.out.println("startingIndex = " + startingIndex );
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3, 5));
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("new date = "+ newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("New Date concat = "+newDate);
    }
}
