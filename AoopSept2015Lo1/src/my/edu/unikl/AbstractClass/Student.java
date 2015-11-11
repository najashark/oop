package my.edu.unikl.AbstractClass;

public abstract class Student {
	
		
		protected String studID;
		
		protected Student(String studID){
			this.studID = studID;
			
		}
		public abstract double calculateFees();
		@Override
		public String toString() {
			return "Student [studID=" + studID + "]";
		}
			
}