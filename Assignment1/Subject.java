public class Subject{
	private String subjectName;
	private String[] student = new String[100]; //set 100 element of array
	private int numberOfStudent;
	
	//Constructor with 1-args
	public Subject(String subjectName){
		this.subjectName = subjectName;
	}
	//Add student using looping for take array args
	public void addStudent(String[] student){
		numberOfStudent = student.length;
		for(int i = 0;i<numberOfStudent;i++){
			this.student[i] = student[i];
		}
	}	
	
	//Accessor
	public String getSubjectName(){
		return subjectName;
	}
	
	public String[] getStudent(){
		return student;
	}
	
	public int getNumberOfStudent(){
		return numberOfStudent;
	}
}