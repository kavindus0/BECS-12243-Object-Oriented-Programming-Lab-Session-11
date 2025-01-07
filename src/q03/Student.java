package q03;

public class Student extends User {
    private String[] enrolledCourses;

    public Student(String name, String userID, String[] enrolledCourses) {
        super(name, userID);
        this.enrolledCourses = enrolledCourses;
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
