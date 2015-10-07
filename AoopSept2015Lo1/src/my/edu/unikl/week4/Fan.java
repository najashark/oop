package my.edu.unikl.week4;

public class Fan {
	public static int SLOW=1;
	public static int MEDIUM=2;
	public static int FAST=3;
	
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5.0;
	private String color="blue";
	
	public Fan(){
		
	}
	public int getSpeed(){
		return speed;
	}
	public boolean getOn(){
		return on;
	}
	public double getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public void setOn(boolean on){
		this.on=on;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String toString(){
		if(on==true)
			return "speed "+speed+", color "+color+", radius "+radius+"\n";
		else
			return "fan is off, color "+color+", radius "+radius+"\n";
	}
}
//exercise 7.2 Fan
