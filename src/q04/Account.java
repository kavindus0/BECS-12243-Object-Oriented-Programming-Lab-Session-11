package q04;

public class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance +=amount;
    }
    public void displayAccountDetails() {
        System.out.println("-----");
        System.out.println(accountNumber);
        System.out.println(accountHolderName);
        System.out.println(balance);
        System.out.println("-----");

    }

}
