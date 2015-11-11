package my.edu.unikl.week4;

public class Loan {
	private double annualInterestRate=0.0;
	private int numberOfYears=0;
	private double loanAmount=0.0;
	
	public Loan()
	{
		
	}
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public int getnumberOfYears()
	{
		return numberOfYears;
	}
	public double getloanAmount()
	{
		return loanAmount;
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	public void setnumberOfYears(int numberOfYears)
	{
		this.numberOfYears = numberOfYears;
	}
	public void setloanAmount(double loanAmount)
	{
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment()
	{
		double EMI=0.0;
		double p=loanAmount;
		double r=(annualInterestRate/1200);
		int n=numberOfYears;
		
		EMI=((p*r*Math.pow((1+r),n))/(Math.pow((1+r),n)));
		return EMI;
	}
	
	public double getTotalPayment()
	{
		double total = 0.0;
		total = getMonthlyPayment()*numberOfYears;
		return total;
	}
}
