package my.edu.unikl.week4;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	   public Stock()
	   {
	       
	   }
	   public Stock(String symbol, String name)
	   {
	      this.symbol = symbol;
	      this.name = name;
	   }//End of 2 arguments constructor
	   
	   public String getSymbol()
	   {
	       return symbol;
	   }
	   
	   public String getName()
	   {
	       return name;
	   }
	   
	   public double getPreviousClosingPrice()
	   {
	       return previousClosingPrice;
	   }
	   
	   public void setPreviousClosingPrice(double previousClosingPrice)
	   {
	       this.previousClosingPrice = previousClosingPrice;
	   }
	   
	   public double getCurrentPrice()
	   {
	       return currentPrice;   
	   }
	   
	   public void setCurrentPrice(double currentPrice)
	   {
	       this.currentPrice = currentPrice;
	   }
	   
	   public double changePercent()
	   {
	       double change;
	       change = (currentPrice - previousClosingPrice) / previousClosingPrice;
	       return change;
	   }
	}
