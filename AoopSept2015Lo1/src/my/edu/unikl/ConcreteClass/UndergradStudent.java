package my.edu.unikl.ConcreteClass;
import my.edu.unikl.AbstractClass.Student;

public class UndergradStudent extends Student{
	private double ratePerCredit;
	private double creditHourdouble;
	
	public UndergradStudent(double ratePerCredit, double creditHourdouble){
		super("1016");
		this.creditHourdouble=creditHourdouble;
		this.ratePerCredit=ratePerCredit;
	}
	public double getRatePerCredit(double ratePerCredit){
		return ratePerCredit;
	}
	public double getCreditHourdouble(double creditHourdouble){
		return creditHourdouble;
	}
	public void setRatePerCredit(double ratePerCredit){
		this.ratePerCredit = ratePerCredit;
	}
	public void setCreditHourdouble(double creditHourdouble){
		this.creditHourdouble = creditHourdouble;
	}
	public double calculateFees(){
		return ratePerCredit*creditHourdouble;
	}
	@Override
	public String toString() {
		return "Undergrad Student [ratePerCredit=" + ratePerCredit
				+ ", credit Hour=" +creditHourdouble+", "+ super.toString() + "]";
	}
	
}
