package my.edu.unikl.assignment1;

public class Subject {
	private String subjectName;
	private String[] arrayStudent = new String[100];
	private int studentNum;
	
	public Subject()
	{
		subjectName = null;
		arrayStudent = null;
		studentNum = 0;
	}
	
	public Subject(String subjectName)
	{
		this.subjectName = subjectName;
	}
	
    public void addStudent(String[] arrayStudent){
    	studentNum = arrayStudent.length;
    	for(int i = 0;i<arrayStudent.length;i++){
    		this.arrayStudent[i] = arrayStudent[i];
    	}
    }
	
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
