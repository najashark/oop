package my.edu.unikl.test;

import my.edu.unikl.week4.Stock;

public class StockTest {

	    public static void main(String[] args)
	    {
	        Stock s = new Stock("SUNW", "Sun Microsystems Inc.");
	        
	        s.setPreviousClosingPrice(100);
	        s.setCurrentPrice(90);
	        
	        System.out.println("The symbol is: "+s.getSymbol());
	        System.out.println("The name is: "+s.getName());
	        System.out.println("The current price is: "+s.getCurrentPrice());
	        System.out.println("The previous closing price: "+s.getPreviousClosingPrice());
	        System.out.println("The price-change percentage: "+s.changePercent());
	        
	    }
}
