package Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Diego", "123US",
                "auza@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());
        System.out.println();
        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());
        System.out.println();
        Customer thirdCustomer = new Customer("Joe", "joe@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());System.out.println();
        Customer newCustomer = new Customer("Joe", "joe.com");
        System.out.println(newCustomer.getName());
        System.out.println(newCustomer.getCreditLimit());
        System.out.println(newCustomer.getEmailAddress());
    }
}
