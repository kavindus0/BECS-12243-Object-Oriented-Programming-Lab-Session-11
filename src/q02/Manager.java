package q02;

public class Manager extends Member {
    private String department;

    public Manager(String name, int age, String phoneNumber, String address,
                  double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}