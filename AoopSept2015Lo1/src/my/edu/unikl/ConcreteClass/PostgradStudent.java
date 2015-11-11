package my.edu.unikl.ConcreteClass;
import my.edu.unikl.AbstractClass.Student;
import my.edu.unikl.InterfaceClass.Researchable;

public class PostgradStudent extends Student implements Researchable{

	private double semesterFee;
	
	/*public PostgradStudent(){
		super();
	}*/
	public PostgradStudent(double semesterFee){
		super("1017");
		this.semesterFee = semesterFee;
	}
	public double getSemesterFee(){
		return semesterFee;
	}
	public void setSemesterFee(double semesterFee){
		this.semesterFee = semesterFee;
	}
	public double calculateFees(){
		return semesterFee;
	}
	public double doResearhAllowance(){
		return semesterFee/10;		
	}
	@Override
	public String toString() {
		return "PostgradStudent [ semester Fee="
				+ semesterFee +", "+ super.toString()+ "]";
	}
	
	

}
