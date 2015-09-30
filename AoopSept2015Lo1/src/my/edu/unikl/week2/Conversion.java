package my.edu.unikl.week2;

public class Conversion {
	//convert from feet to meters
	public static double feetToMeter(double feet)
	{
		return 0.305*feet;
	}
	
	public static double meterToFeet(double meter)
	{
		return 3.279*meter;
	}
	public static void main(String[] args)
	{
		double ft,m;
		System.out.println("Feet\t\tMeters  | \tMeters\t\tFeet");
		System.out.println("-----------------------------------------------");
		for (ft=1,m=20;ft<=10;ft++,m=m+5)
		{
			//System.out.print(ft+"\t\t" +feetToMeter(m));
			System.out.printf("%.1f\t\t%.3f",ft,feetToMeter(ft));
			//System.out.println("\t|\t"+m+"\t\t|" +meterToFeet(ft));
			System.out.printf("\t|\t%.1f\t\t%.3f\n",m,meterToFeet(m));
		}
	}

}
