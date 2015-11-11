package my.edu.unikl.assignment1;

public class Subject {
	private String subjectName = null;
	private String[] arrayStudent = new String[100];
	private int studentNum = 0;
	
	public Subject()
	{
		subjectName = null;
		arrayStudent = null;
		studentNum = 0;
	}
	//Constructor with 1-args
	public Subject(String subjectName)
	{
		this.subjectName = subjectName;
	}
	//Add student using looping for take array args
    public void addStudent(String[] arrayStudent){
    	studentNum = arrayStudent.length;
    	for(int i = 0;i<arrayStudent.length;i++){
    		this.arrayStudent[i] = arrayStudent[i];
    	}
    }
  //Accessor
	public String getSubjectName()
	{
		return subjectName;
	}
	
	public String[] getArrayStudent()
	{
		return arrayStudent;
	}
	
	public int getStudentNum()
	{
		return studentNum;
	}
}
