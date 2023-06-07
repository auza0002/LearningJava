package Switch;


public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMoth(1,2020));
        System.out.println(getDaysInMoth(2,2020));
        System.out.println(getDaysInMoth(2,2018));
        System.out.println(getDaysInMoth(2,-2018));
        System.out.println(getDaysInMoth(-2,2018));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
    public static boolean isLeapYear(int isLeapYear) {
        boolean response = false;
        if(isLeapYear >= 1 && isLeapYear <= 9999){
            if (isLeapYear % 4 == 0) {
                if (isLeapYear % 100 == 0) {
                    if (isLeapYear % 400 == 0) {
                        response =  true;
                    } else {
                        response = false;
                    }
                } else {
                    response = true;
                }
            } else {
                response = false;
            }
        }
        return response;
    }
    public static int getDaysInMoth(int month, int year){
        int response = -1;
        if((year >= 1 && year <= 9999) && (month >= 1 && month <= 12)){
            boolean isLeapYearResponse =  isLeapYear(year);
            if(isLeapYearResponse == true){
                switch (month) {
                    case  4, 6, 9, 11:
                        response = 30;
                        break;
                    case 2 : response =29;
                    break;
                    default : response = 31;
                }
            }else {
                switch (month) {
                    case  4, 6, 9, 11:
                        response = 30;
                        break;
                    case 2 : response =28;
                        break;
                    default : response = 31;
                }
            }

        }
        return response;
    }
}


