package my.edu.unikl.week3;

public class Triangle 
{
    public double side1;
    public double side2;
    public double side3;
    
    public Triangle()
    {
        
    }//End of default constructor
    
    public Triangle(double side1,double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double calculateArea()
    {
        double area;
        double s;
        s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s *(s-side1) * (s-side2) * (s-side3));
        return area;
    }
    
    public double calculatePerimeter()
    {
        double perimeter;
        perimeter = side1 + side2 + side3;
        return perimeter;
    }
    
    /*
    public String toString()
    {
        return "\nSide1: "+side1+ "\nSide2: "+side2+ "\nSide3: "+side3+ "\nArea: "+calculateArea()+ "\nPerimeter: "+calculatePerimeter();
    }*/
}
