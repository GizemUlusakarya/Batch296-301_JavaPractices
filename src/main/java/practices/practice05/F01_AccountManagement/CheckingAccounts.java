package practices.practice05.F01_AccountManagement;

public class CheckingAccounts extends BankAccount{

    // New attribute unique to CheckingAccounts
    private int transactionLimit;

    // Constructor for CheckingAccounts
    public CheckingAccounts(String accountNumber, double balance,int transactionLimit){
        super(accountNumber, balance);
        this.transactionLimit = transactionLimit; // Initialize the new attribute
    }

    // Implement the deposit()
    @Override
    public void deposit(double amount) {
        balance += amount; // Add the deposited amount to the balance
        System.out.println("Deposited £" + amount + " into Checking Account");
    }

    // New method unique to CheckingAccounts
    public void withdraw(double amount){
        if ((amount <= transactionLimit && amount <= balance)) {  //Ckecj limits and balance
            balance -= amount; // Deduct the amount from the balance
            System.out.println("Withdraw £" + amount+ " from Checking Account.");
        } else{
            System.out.println("Transaction exceeds limit or insufficient funds.");
        }
    }

}
