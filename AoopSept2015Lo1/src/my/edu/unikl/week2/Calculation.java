package my.edu.unikl.week2;

public class Calculation {
	public static double CalculateTotal(double N1,double N2,double N3)
	{
		double total;
		total=N1+N2+N3;
		return total;
	}
	
	public static void main(String[] args)
	{
		double num1=2,num2=3,num3=5;
		double sum=CalculateTotal(num1,num2,num3);
		System.out.print("Total: "+sum);
	}

}
