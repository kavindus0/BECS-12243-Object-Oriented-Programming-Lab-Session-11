package q02;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Wasanth Vittachchi", 25, "7266776666",
                                  "1/23 Sandamadulla, Kandy", 59000, "Software Development");

        Manager mgr = new Manager("Janaka Sumith", 35, "2336632323",
                                "45/6 Ampara, Town", 83000, "IT");

        System.out.println("Employee Salary:");
        emp.printSalary();

        System.out.println("\nManager Salary:");
        mgr.printSalary();

        System.out.println("\nEmployee Details:");
        emp.printDetails();

        System.out.println("\nManager Details:");
        mgr.printDetails();
    }
}