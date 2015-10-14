package my.edu.unikl.assignment1;

public class Sales //Sales class
{
    private String salesId;
    private double amount;
    
    public Sales() //Default constructor
    {
        salesId = null;
        amount = 0.0;
    }
    
    public Sales(String salesId, double amount) //2 Arguments constructor
    {
        this.salesId = salesId;
        this.amount = amount;
    }
    
    public String getSalesId() //Accessor method 
    {
        return salesId;
    }
    
    public void setSalesId(String salesId) //Mutator method
    {
        this.salesId = salesId;
    }
    
    public double getAmount() //Accessor method 
    {
        return amount;
    }
    
    public void setAmount(double amount) //Mutator method
    {
        this.amount = amount;
    }
    
    public double determineDiscount(double amount) //Method to calculate discount
    {
        double discount = 0;
        
        if(amount >= 900)
        {
            discount = amount * 0.1;
        }
        
        else if(amount >= 500 && amount < 900)
        {
            discount = amount * 0.08;
        }
        
        else if(amount > 0 && amount < 500)
        {
            discount = amount * 0.04;
        }
        
        return discount;
    }
    
    public void displaySalesObject(String salesId, double amount) //Method to display sales id and amount
    {
       System.out.println("The sales ID is: "+ salesId);
       System.out.println("The amount of sales is: RM"+ amount);
       
    }
    
    public void displaySalesArray() //Method to display sales id and amount in array
    {
        System.out.println("\n"+"The sales ID is: "+ salesId);
        System.out.println("The amount of sales is: RM"+ amount+"\n");
    }
}
