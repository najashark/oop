package my.edu.unikl.week2;
import java.util.*;
public class TemperatureTest {
	private static Scanner Scanner;
	public static void main(String[] args)
	{
		Scanner = new Scanner(System.in);
		
		Temperature Temp1 = new Temperature();
		System.out.print("Please input the value of fahrenheit: ");
		Temp1.Fahrenheit = Scanner.nextDouble();
		System.out.println("The Celcius for Fahrenheit "+Temp1.Fahrenheit+" = "+Temp1.convertFahrenheitToCelcius()+" Celcius");
		
		System.out.println("===========================================================+");
		
		Temperature temp2 = new Temperature();
		temp2.Fahrenheit=100.0;
		//System.out.println("The Celcius for Fahrenheit "+temp2.Fahrenheit+" = "+temp2.convertFahrenheitToCelcius()+" Celcius");
		System.out.printf("The Celcius for Fahrenheit %.2f = %.2f Celcius",temp2.Fahrenheit,temp2.convertFahrenheitToCelcius());
	}
}
