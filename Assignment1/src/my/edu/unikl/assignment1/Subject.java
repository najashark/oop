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
	
    public boolean addStudent(String student){
        if(studentNum < 100){
            for(int i = 0; i < studentNum; i++){
                if(student.equals(arrayStudent[i]))
                return false;
            }
            arrayStudent[studentNum] = student;
            studentNum++;
        return true;
        }
        return false;
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
    public void displayArrayStudent() //Method to display sales id and amount in array
    {
        System.out.println("student name : "+ arrayStudent+"\n");
    }

}
