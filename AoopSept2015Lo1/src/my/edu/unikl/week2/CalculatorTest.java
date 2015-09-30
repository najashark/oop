package my.edu.unikl.week2;

public class CalculatorTest {
	public static void main(String[] args)
	{
		Calculator cal1 = new Calculator();
		cal1.num1 = 5;
		cal1.num2 = 2;
		
		System.out.println("Total: "+cal1.Total());
		System.out.println("Difference: "+cal1.Difference());
		System.out.println("Multiplication: "+cal1.Multiplication());
		System.out.println("Division: "+cal1.Division());
	}

}
