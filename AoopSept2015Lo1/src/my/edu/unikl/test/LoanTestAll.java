package my.edu.unikl.test;
import my.edu.unikl.week4.*;

public class LoanTestAll {
	
	public static void main(String[] args)
	{
		CarLoan car1 = new CarLoan();
		CarLoan car2 = new CarLoan("Proton Persona");
		
		System.out.println(car1);
		System.out.println(car2);
		
		car1.setCarName("Proton Exora");
		car1.setAnnualInterestRate(3.5);
		car1.setloanAmount(70000);
		car1.setnumberOfYears(9);
		
		car2.setCarName("Proton Persona");
		car2.setAnnualInterestRate(3.5);
		car2.setloanAmount(50000);
		car2.setnumberOfYears(3);
		
		System.out.println("Car name=" +car1.getCarName()+", Annual interest rate="+car1.getAnnualInterestRate()+", Number of years="+car1.getnumberOfYears());
		System.out.printf("Loan amount= %.2f",car1.getloanAmount());
		System.out.printf(", monthly payment= %.2f",car1.getMonthlyPayment());
		System.out.printf(", Total Payment= %.2f",car1.getTotalPayment());
		
		System.out.println("\n\nCar name=" +car2.getCarName()+", Annual interest rate="+car2.getAnnualInterestRate()+", Number of years="+car2.getnumberOfYears());
		System.out.printf("Loan amount= %.2f",car2.getloanAmount());
		System.out.printf(", monthly payment= %.2f",car2.getMonthlyPayment());
		System.out.printf(", Total Payment= %.2f",car2.getTotalPayment());
		
		HomeLoan hl1 = new HomeLoan("Bungalow");
		HomeLoan hl2 = new HomeLoan("Double Storey Terrace", 5.5,10,2000000);
		
		System.out.print(hl1);
		System.out.print(hl2);
		
		Loan p1;
		
		p1 = new CarLoan();
		
		//print objects by calling the toString method b4 update
		System.out.println((CarLoan)p1);
		
		((CarLoan)p1).setCarName("Toyota Vios");
		((CarLoan)p1).setAnnualInterestRate(5.5);
		((CarLoan)p1).setnumberOfYears(5);
		((CarLoan)p1).setloanAmount(100000);
		System.out.print("Car name : "+((CarLoan)p1).getCarName());
		
		p1 = new HomeLoan();
		
		((HomeLoan)p1).setTypeOfHome("Double Storey Bungalow");
		((HomeLoan)p1).setAnnualInterestRate(10.5);
		((HomeLoan)p1).setnumberOfYears(10);
		((HomeLoan)p1).setloanAmount(400000000);
		
		
		
	}

}
