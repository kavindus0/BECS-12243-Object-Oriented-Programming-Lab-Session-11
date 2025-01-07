package q03;

public class User {
    protected String name;
    protected String userID;

    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }

    public void login() {
        System.out.println("User " + name + " with ID " + userID + " has logged in.");
    }
}