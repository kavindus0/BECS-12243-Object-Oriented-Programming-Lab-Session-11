package q03;

public class Student extends User {
    public static void main(String[] args) {
        Student std = new Student();
        std.viewCourses();





    }
    void viewCourses(){
        String Courses[] = new String[] {"Course01","Course02"};
        System.out.println("Enrolled Courses: "+Courses.toString());
    }

}
