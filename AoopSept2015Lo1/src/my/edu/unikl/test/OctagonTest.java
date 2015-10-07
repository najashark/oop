package my.edu.unikl.test;

import java.util.*;

import my.edu.unikl.week3.Octagon;
public class OctagonTest {

    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Octagon oct1 = new Octagon();
        
        System.out.println("Please input the value of side: ");
        oct1.side = sc.nextDouble();
        System.out.println("The area of octagon is: "+oct1.calculateArea());
        System.out.println("The perimeter of octagon is: "+oct1.calculatePerimeter());       
    }
}

