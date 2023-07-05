package Person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age > 100 || age < 0){
            age = 0;
        }
        this.age = age;
    }
    public boolean isTeen(){
        boolean result = false;
        if(age > 12 && age < 20){
            result = true;
        }
        return result;
    }
    public String getFullName(){
        if(lastName.isEmpty() && firstName.isEmpty()){
            return "";
        }
     else if(lastName.isEmpty() || lastName == null){
         return firstName;
     } else if(firstName.isEmpty() || firstName == null){
         return lastName;
     }
     return firstName +" " + lastName;
    }
}
