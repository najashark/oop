package my.edu.unikl.week2;

public class Calculator {
	
	public double num1;
	public double num2;
	public double cal;
	
	public Calculator()
	{	
	}
	public Calculator(double num1,double num2,double cal)
	{
		this.num1=num1;
		this.num2=num2;
		this.cal=cal;
	}
	public double Total()
	{
		cal = num1+num2;
		System.out.println("Total: "+cal);
		return cal;
	}
	public double Difference()
	{
		cal = num1-num2;
		System.out.println("Difference: "+cal);
		return cal;
	}
	public double Multiplication()
	{
		cal = num1*num2;
		System.out.println("Multiplication: "+cal);
		return cal;
	}
	public double Division()
	{
		cal = num1/num2;
		System.out.println("Division: "+cal);
		return cal;
	}
}
