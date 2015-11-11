package my.edu.unikl.test;

import my.edu.unikl.ConcreteClass.PostgradStudent;
import my.edu.unikl.ConcreteClass.UndergradStudent;

public class abstractTest {
	public static void main(String[] args){
		UndergradStudent us = new UndergradStudent(20, 15);
		PostgradStudent ps = new PostgradStudent(1000);
		
		System.out.println(us);
		System.out.println("the fees : "+us.calculateFees());
		
		System.out.println(ps);
		System.out.println("the fees : "+ps.calculateFees());
		System.out.println("Research allowance : "+ps.doResearhAllowance());
		
	}

}
