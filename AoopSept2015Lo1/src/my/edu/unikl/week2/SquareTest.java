package my.edu.unikl.week2;

public class SquareTest {

	public static void main(String[] args)
	{
		Square sqr1 = new Square();
		sqr1.side=2;
		System.out.println("Area of square: "+sqr1.calculateArea());
		System.out.println("Perimeter of square: "+sqr1.calculatePerimeter());
	}
}
