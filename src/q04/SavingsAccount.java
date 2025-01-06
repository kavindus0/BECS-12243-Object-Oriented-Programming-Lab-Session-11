package q04;

public class SavingsAccount extends Account {
    double interestRate = 0.15;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void withdraw(double amount){
        if (super.balance >=0){
            System.out.println("Withdrawn Successfully "+amount);
            super.balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }


    public void applyInterest(){
        double Interest = balance * interestRate / 100;
        System.out.println("Interest is "+Interest+ " And Applying For Your Account");
        super.balance += Interest;
    }


}
