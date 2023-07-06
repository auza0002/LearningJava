package Customer;

public class Customer {

    private String name;
    private String creditLimit;
    private String emailAddress;

    public Customer(){
        this("Nobody", "noboday@nowhere.com");
    }
    public Customer(String name, String emailAddress) {
        this(name, "1000", emailAddress);
    }

    public Customer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
