package my.edu.unikl.week4;

import java.util.Date;

public class Account {

	 private   int id = 0;
     private   double balance = 0;
     private   double AnnualInterestRate = 0;
     private   Date DateCreated;
    
     public Account()
     {
     //no arg-constructor
         DateCreated = new Date();
     }
    
     public int getid()
     {
         return id;
     }
    
     public double getbalance()
     {
         return balance;
     }
    
     public double getAnnualInterestRate()
     {
         return AnnualInterestRate;
     }
    
     public double getMonthlyInterestRate()
     {
         return balance*(AnnualInterestRate/1200);
     }
    
     public Date getDateCreated()
     {
         return DateCreated;
     }
    
     public void setid(int id)
     {
         this.id = id;
     }
    
     public void setbalance(double balance)
     {
         this.balance = balance;
     }

     public void setAnnualInterestRate(double AnnualInterestRate)
     {
         this.AnnualInterestRate = AnnualInterestRate;
     }
    
     public double Withdraw(double amount)
     {
         return balance -= amount;
     }
    
     public double Deposit(double amount)
     {
         return balance += amount;
     }
	
	
}
