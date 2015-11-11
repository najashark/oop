package my.edu.unikl.week4;

public class CarLoan extends Loan{
	private String carName=null;
	
	public CarLoan()
	{
		super();
	}
	public CarLoan(String carName)
	{
		super(3.5,7,50000);
		this.carName=carName;
	}
	public CarLoan(String carName,double annualInterestRate,int numberOfYears,double loanAmount)
	{
		super(annualInterestRate,numberOfYears,loanAmount);
		this.carName = carName;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
}
