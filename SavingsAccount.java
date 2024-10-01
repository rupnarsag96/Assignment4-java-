/*Create a SavingsAccount class. Use a static data member annual Interest Rate 
to store the annual interest rate for each of the savers. Each member of the class
 contains a private data member savingsBalance indicating the amount the saver 
currently has on deposit. Provide member function calculateMonthlyInterest() that 
calculates the monthlyinterest by multiplying the balance by annualInterestRate
divided by 12; this interest should be added to savingsBalance. Provide a static 
member function modifyInterestRate() that sets the static annualInterestRate to
 a new value. Write a driver program totest class SavingsAccount. Instantiate two
 different objects of classSavingsAccount, saver1 and saver2, with balances of
2000.00 and 3000.00,respectively. Set the annualInterestRate to
3 percent. Then calculate the monthlyinterest and print the new balances for each 
of the savers. Then set
The annualInterestRate to 4 percent, calculate the next month's interest and print
 the new balances for each of the savers.*/

package assignment4;
public class SavingsAccount {
	private static double annualInterestRate;
    private double savingsBalance;

   
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    
    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        
        SavingsAccount.modifyInterestRate(0.03);

        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after 3%% interest: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after 3%% interest: $%.2f\n", saver2.getSavingsBalance());

        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 new balance after interest: $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 new balance after interest: $%.2f\n", saver2.getSavingsBalance());
    
    }

}

