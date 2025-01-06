package q02;

// Parent class Member
public class Member {
    // Data members
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public double printSalary() {
        return salary;
    }

    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}
