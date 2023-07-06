package BankAccount;



public class Bank {
private String number;
private double balance;
private String customerName;
private String customerEmail;
private String customerPhone;

public Bank(){
    System.out.println("Empty constructor called");
}
public Bank( String number, double balance, String customerName, String customerEmail, String customerPhone){
    System.out.println(" Account constructor with parameters");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.customerPhone = customerPhone;

}

public void depositFound (double depositAmount){
    balance += depositAmount;
    System.out.println(" Deposit of $" + depositAmount + " made. New balance is $" + balance);
}

public void withDrawingAmount( double drawingAmount){
    if(balance - drawingAmount < 0){
        System.out.println(" Insufficient funds! you only have $" + balance);
    } else {
        balance -= drawingAmount;
        System.out.println(" WithDrawing of $" + drawingAmount + " processed, Remaining balance $" + balance);
    }
}
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    public void bankDetails(){
        System.out.println(" Name: " + customerName);
        System.out.println(" Number: " + number);
        System.out.println(" Balance: $" + balance);
        System.out.println(" Email: "+ customerEmail);
        System.out.println(" Phone Number :" + customerPhone);
    }
}
