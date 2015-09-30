package my.edu.unikl.week2;

public class CalculatorTest2 {
	public static void main(String[] args)
	{
		Calculator cal1 = new Calculator();
		cal1.num1 = 15;
		cal1.num2 = 12;
		
		cal1.Total();
		cal1.Difference();
		cal1.Multiplication();
		cal1.Division();
	}

}
