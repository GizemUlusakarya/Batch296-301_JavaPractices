package practices.practice05.F02_LoanManagement;

public interface LoanAccount {
    void  takeLoan(double amount);  //the user borrow money
    void payLoan(double amount);    // the user to repay part of their loan

}
