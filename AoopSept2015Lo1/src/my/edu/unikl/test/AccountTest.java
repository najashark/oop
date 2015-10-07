package my.edu.unikl.test;
import my.edu.unikl.week4.Account;
public class AccountTest {

	public static void main(String[] args)
    {
        Account Account = new Account();
       
        Account.setid(1122);
        Account.setbalance(20000);
        Account.setAnnualInterestRate(4.5);
        Account.Withdraw(2500);
        Account.Deposit(3000);
       
        System.out.print("Balance is :"+Account.getbalance());
        System.out.print("\nMonthly Interest Rate is : "+ Account.getMonthlyInterestRate());
        System.out.print("\nDate Created : "+Account.getDateCreated());
       
       
    }
}
