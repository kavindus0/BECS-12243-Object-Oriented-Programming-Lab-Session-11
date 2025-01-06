package q03;

import java.util.Arrays;

public class Student extends User {
    public static void main(String[] args) {
        Student std = new Student();
        std.viewCourses();





    }
    void viewCourses(){
        String Courses[] = new String[] {"Course01","Course02"};
        System.out.printf("Enrolled Courses : ");
        for (int i = 0; i < Courses.length; i++) {
            System.out.printf(Courses[i]);
            System.out.printf(", ");
        }
    }

}
