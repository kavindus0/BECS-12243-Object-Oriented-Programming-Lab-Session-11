package q03;

public class Main {
    public static void main(String[] args) {

        String[] studentCourses = {"C++", "Web Development", "Data Structures"};
        Student student = new Student("Janitha Dasun", "S001", studentCourses);


        String[] instructorCourses = {"Python 101", "Advanced Python"};
        Instructor instructor = new Instructor("Dr. Sujeewa", "I001", instructorCourses);

        student.login();
        instructor.login();


        student.viewCourses();

        instructor.assignGrades("Janitha Dasun", "A");

           // student.assignGrades("Test Student", "B");
           // System.out.println("Student cannot access instructor methods");


        //  instructor.viewCourses();
            //System.out.println("Instructor cannot access student methods");

    }
}