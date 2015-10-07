package my.edu.unikl.test;

import java.util.*;

import my.edu.unikl.week3.Triangle;

public class TriangleTest 
{
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Triangle t1 = new Triangle();
        
        System.out.println("Please enter side 1: ");
        t1.side1 = input.nextDouble();
        System.out.println("Please enter side 2: ");
        t1.side2 = input.nextDouble();
        System.out.println("Please enter side 3: ");
        t1.side3 = input.nextDouble();
        
        System.out.println("The area of triangle: "+t1.calculateArea());
        System.out.println("The perimeter of triangle: "+t1.calculatePerimeter());
    }
}
