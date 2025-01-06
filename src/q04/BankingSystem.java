package q04;

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount01 = new SavingsAccount("SAV001","Sumana Galappaththi",32500);
        CurrentAccount currentAccount01 = new CurrentAccount("CURR001","Ajith Muthukumarana",65000);

        currentAccount01.setCreditLimit(9500);
        currentAccount01.displayAccountDetails();

        savingsAccount01.withdraw(100);
        savingsAccount01.displayAccountDetails();

        currentAccount01.withdraw(100);
        currentAccount01.displayAccountDetails();

        savingsAccount01.deposit(6500);
        savingsAccount01.displayAccountDetails();

        currentAccount01.deposit(7500);
        currentAccount01.displayAccountDetails();

        savingsAccount01.applyInterest();
        savingsAccount01.displayAccountDetails();

        currentAccount01.withdraw(5000);
        currentAccount01.displayAccountDetails();

        currentAccount01.withdraw(35000);
        currentAccount01.displayAccountDetails();
    }

}
