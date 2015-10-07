package my.edu.unikl.week3;

public class Octagon
{
    public double side;
    
    public Octagon()
    {
    
    }//End of default constructor
    
    public Octagon(double side)
    {
        this.side=side;
    }//End of one-args constructor
    
    public double calculateArea()
    {
        double area;
        area = 2 * (side * side) * (1 + Math.sqrt(2));
        return area;
    }
    
    public double calculatePerimeter()
    {
        double perimeter;
        perimeter = 8 * side;
        return perimeter;
    }
    /*
    public String toString()
    {
        return "\nSide: "+side+ "\nArea: "+calculateArea()+ "\nPerimeter: "+calculatePerimeter();
    }*/
}
