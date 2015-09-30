package my.edu.unikl.week2;

public class Square {

	public double side;
	public Square()
	{	
	}
	public Square(double side)
	{
		this.side = side;
	}
	public double calculateArea()
	{
		return side*side;
	}
	public double calculatePerimeter()
	{
		return side+side+side+side;
	}
}
