package AUG2025.AUG17;

public class ExceptionRunner {

    /*
    Garbage Collector frequently scans memory and deletes unused data.
    Garbage Collector finalizes the data before deleting it.
     */


    public static void main(String[] args) throws InvalidStudentGradeException {

        getStudentGrade(50);

      //  getStudentGrade(-50);//InvalidStudentGradeException due to this exception runtimeexception it will en the execution

        getTheNumberOfStudents(50);//50
        getTheNumberOfStudents(-50);//InvalidNumberException






    }
    //runtime exceptions cannot show you the error until it pops out no need to use try catch
    public static void getStudentGrade(int grade) throws InvalidStudentGradeException {

        if(grade <0 || grade>100){
            throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");
        }else {
            System.out.println(grade);
        }

    }
    //compileTime exceptions needs try catches or they never become usable.
    public static void getTheNumberOfStudents(int numOfStudents){

        if(numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            } catch (InvalidNumberException e) {
                System.err.println(e.getMessage());
            }
        }else{
            System.out.println(numOfStudents);
        }
    }





}
