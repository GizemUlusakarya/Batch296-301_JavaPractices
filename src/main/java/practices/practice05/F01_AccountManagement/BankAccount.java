package practices.practice05.F01_AccountManagement;

public abstract class BankAccount {

    protected String accountNumber;
    protected double balance;

    //Constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract Method - deposit()
    public abstract void deposit(double amount);

    // Concrete Method - showBalance()
    public void showBalance(){
        System.out.println("Account Number :" + accountNumber + ", Balance: £" + balance);
    }
}
