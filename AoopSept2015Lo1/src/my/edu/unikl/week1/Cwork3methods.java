package my.edu.unikl.week1;
import java.util.*;

public class Cwork3methods {

	private static Scanner sc;

	public static void main(String[] args) 
	{//class for input
		sc = new Scanner(System.in);
		
	//declare variable
	double test,quiz,assignment,project,T,Q,A,P,totalcw;
	
	//input
	System.out.print("Please enter your Test mark: ");
	test = sc.nextDouble();
	System.out.print("Please enter your Quiz mark: ");
	quiz = sc.nextDouble();
	System.out.print("Please enter your Assignment mark: ");
	assignment = sc.nextDouble();
	System.out.print("Please enter your Project mark: ");
	project = sc.nextDouble();
	
	//formula
	T=(test/50)*20;
	Q=(quiz/20)*10;
	A=(assignment/40)*15;
	P=(project/40)*15;
	totalcw=T+Q+A+P;
	
	//output
	System.out.println("Your total test is: "+T);
	System.out.println("Your total quiz is: "+Q);
	System.out.println("Your total assignment is: "+A);
	System.out.println("Your total project is: "+P);
	System.out.println("Formatted to 2 decimal points");
	System.out.printf("Your total coursework is: %.2f",totalcw);
	}

}
