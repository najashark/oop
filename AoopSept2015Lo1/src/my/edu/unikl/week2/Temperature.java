package my.edu.unikl.week2;
public class Temperature {

	public double Fahrenheit;
	
	public Temperature()
	{	
	}
	public Temperature(double Fahrenheit)
	{
		this.Fahrenheit=Fahrenheit;
	}
	public double convertFahrenheitToCelcius()
	{
		return (5.0/9.0)*(Fahrenheit-32.0);
	}
	
}