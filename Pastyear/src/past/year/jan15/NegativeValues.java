package past.year.jan15;

public class NegativeValues extends Values
{
	public NegativeValues(){
		this(-1);
	}
	public NegativeValues(int x){
		super(x);
		System.out.println(x);
	}
	public void print(){
		System.out.println("Printing continues..");
	}
}