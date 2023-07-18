package Student;

public class Main {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 5 ; i ++){
            LPAStudent s = new LPAStudent("S92300" +  i , switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            },
                    "05/11/1985", " Java MasterClass");
            System.out.println(s);
        }
        Student pojoStudent  = new Student ("S923006" , "Ann", "05/11/1985", "Java MasterClass");
        LPAStudent recordStudent = new LPAStudent("S93007", "Bill", "05/11,1985", "Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + " ,Java OCp Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + " , Java OCp Exam 829");

        System.out.println(pojoStudent.getName() + " is taking" + pojoStudent.getClassList());

        System.out.println(recordStudent.name() + " is taking" + recordStudent.classList());
    }
}
