package q03;

public class Student extends User {
    private String[] enrolledCourses;

    public Student(String name, String userID, String[] enrolledCourses) {
        super(name, userID);
        this.enrolledCourses = enrolledCourses;
    }

    public void viewCourses() {
        System.out.println("Enrolled Courses: " + String.join(", ", enrolledCourses));
    }
}