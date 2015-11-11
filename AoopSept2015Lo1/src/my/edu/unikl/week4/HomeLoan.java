package my.edu.unikl.week4;

public class HomeLoan extends Loan{
	
	private String typeOfHome=null;
	public HomeLoan()
	{
		super();
	}
	public HomeLoan(String typeOfHome)
	{
		super(5.5,5,250000);
		this.typeOfHome = typeOfHome;
	}
	public HomeLoan(String typeOfHome, double annualInterestRate, int numberOfYears, double loanAmount)
	{
		super(annualInterestRate, numberOfYears, loanAmount);
		this.typeOfHome = typeOfHome;
	}
	public String getTypeOfHome() 
	{
		return typeOfHome;
	}
	public void setTypeOfHome(String typeOfHome) 
	{
		this.typeOfHome = typeOfHome;
	}
	

}
