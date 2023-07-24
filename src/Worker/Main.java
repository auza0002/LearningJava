package Worker;



public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim" , "11/11/1985",  "01/01/2020");
        System.out.println(tim);
        System.out.println("Age " + tim.getAge());
        System.out.println("Pay = "+ tim.collectPay());
    }
}
class Worker{
    private String name;
    private  String birthDate;
    protected String endDate;
    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1 ;
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}


