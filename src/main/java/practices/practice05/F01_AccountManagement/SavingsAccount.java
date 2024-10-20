package practices.practice05.F01_AccountManagement;

public class SavingsAccount extends BankAccount{

    // New attribute unique to SavingsAccount
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount (String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);      // Call to parent class (BankAccount) constructor
        this.interestRate = interestRate;   // Initialize the new attribute
    }

    // Implementing deposit()
    @Override
    public void deposit(double amount){
        balance += amount; // Add the deposited amount to the balance ==> balance = balance + amount;
        System.out.println("Deposited £" + amount + " into Savings Account.");
    }

    // New method unique to SavingsAccount
    public void calculateInterest(){
        double interest = balance * interestRate;   // Calculate interest
        balance += interest; //Add interest to the balance ==> balance = balance + interest;
        System.out.println("Interest of £" + interest + " added to Savings Account.");
    }

}
