package my.edu.unikl.test;
import my.edu.unikl.week4.*;

public class FanTest {
	public static void main(String[] args){
		
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setOn(true);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		
		System.out.println("Fan Speed: "+fan1.getSpeed()+"\nFan Radius: "+fan1.getRadius()+"\nFan color: "+fan1.getColor()+"\n");
		//System.out.println(fan1);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setOn(false);
		fan2.setRadius(5);
		fan2.setColor("blue");
		System.out.println(fan2);
		
	}

}
// exercise 7.2 Fan