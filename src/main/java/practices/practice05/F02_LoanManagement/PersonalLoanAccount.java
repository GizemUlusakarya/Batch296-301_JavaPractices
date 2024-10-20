package practices.practice05.F02_LoanManagement;

import practices.practice05.F01_AccountManagement.BankAccount;

public class PersonalLoanAccount extends BankAccount implements LoanAccount{

    // Keep track of how much the user owes
    private double loanBalance;

    // Constructor
    public PersonalLoanAccount(String accountNumber, double balance){
        super(accountNumber, balance);  // Initiliaze accountNumber and balance in the parent class
        this.loanBalance = 0; // Initially, the user doesn't owe any money
    }

    // Implementing the deposit method from BankAccount class
    @Override
    public void deposit(double amount) {
        balance += amount; // Add the deposited amount to the balance
        System.out.println("Deposited £" + amount + " into Personal Loan Account.");
    }

    // Implementing the takeLoan method from LoanAccount interface
    @Override
    public void takeLoan(double amount) {
        loanBalance += amount; // Increase the loan balance by the borrowed amount
        System.out.println("Took a loan £" + amount + " . Loan Balance: £" + loanBalance);
    }

    //
    @Override
    public void payLoan(double amount) {
        if (amount <= loanBalance){
            loanBalance -= amount; // Decrease the loan balance by the repayment amount
            System.out.println("Paid £" + amount + " towards the loan. Remaining Loan Balance: £" + loanBalance);
        } else {
            System.out.println("Amount exceed the loan balance.");
        }
    }

     // Optionally, show the current loan balance
        public void showLoanBalance(){
            System.out.println("Current Loan Balance: £" + loanBalance);
        }









}
