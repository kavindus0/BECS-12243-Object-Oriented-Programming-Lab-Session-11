package q04;

public class CurrentAccount extends Account{
   double  creditLimit ;
    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void withdraw(double amount){
        if (amount >= super.balance && amount<=creditLimit){
            System.out.println("Withrawn Successfully "+amount);
            super.balance-=amount;
        } else {
            System.out.println("Unavailable RN");
        }
        
    }
}
