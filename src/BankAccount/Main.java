package BankAccount;

public class Main {
    public static void main(String[] args) {
            Bank bank = new Bank();
            bank.setCustomerName("Diego Luis Auza Trujillo");
            bank.setBalance(1000.00);
            bank.setCustomerEmail("auzajuan1@gmail.com");
            bank.setCustomerPhone("3118999898Bala");
            bank.bankDetails();
            bank.withDrawingAmount(100.0);
            bank.depositFound(250);
    }
}
