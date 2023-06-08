package Loop;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println(" calculate interest of 10,000 at 2% = " + calculateInterest(10000.0, 2.0));
       for (double rate = 2.0 ; rate <= 5.0 ; rate++){
           double interestAmount = calculateInterest(100000.0, rate);
           System.out.println("10.000 at "+ rate + "% interest = " + interestAmount);
       }
    }
    public static double calculateInterest ( double amount, double interestRate){
        return ( amount  *(interestRate / 100));
    }
}
