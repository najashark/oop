package my.edu.unikl.test;

import java.util.*;
import my.edu.unikl.assignment1.Sales;

public class SalesTest //Test class
{
    @SuppressWarnings("resource")
	public static void main(String[] args) //Main method
    {   
        Scanner input = new Scanner(System.in); //User input
        Sales s1 = new Sales("SALE6003", 800); //Create object s1
        Sales s2 = new Sales("SALE7003", 400); //Create object s2
        
        s2.setSalesId("SALE5003"); //Set s2 sales id to new value
        s2.setAmount(500); //Set s2 amount to new value
    
        s1.displaySalesObject(s1.getSalesId(), s1.getAmount()); //Display s1 value
        System.out.println("The discount is: RM"+s1.determineDiscount(s1.getAmount())+"\n"); //Display discount for s1
        s2.displaySalesObject(s2.getSalesId(), s2.getAmount()); //Display s2 value
        System.out.println("The discount is: RM"+s2.determineDiscount(s2.getAmount())+"\n"); //Display discount for s2
        
        Sales[] salesArray = new Sales[4]; //Create an array of object
        
        for(int i = 0; i < salesArray.length; i++) //Loop for array input
        {
            System.out.println("Input sales ID: ");
            String salesId = input.next(); //Input sales id
      
            System.out.println("Input the amount of sales: ");
            double amount = input.nextDouble(); //Input amount
           
            salesArray[i] = new Sales(); //Create new sales
            salesArray[i].setSalesId(salesId); //Set sales id value to setSalesId method
            salesArray[i].setAmount(amount); //Set amount value to setAmount method
        }
        
        for (int i = 0; i < salesArray.length; i++) //Loop for array output
        {
            salesArray[i].displaySalesArray(); //Call displaySalesArray method to output
        }
    }
}

