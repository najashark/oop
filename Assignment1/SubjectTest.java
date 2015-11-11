import java.util.Arrays;

public class SubjectTest{
	public static void main(String[] args){
		
		Subject database = new Subject("Database"); //database object passing to cons 1args
		
		String[] name = {"Ali Abu","Atan Aton","Lina Tan"}; //name set to array for passing to array
		database.addStudent(name); //name sent to addStudent method
		System.out.println("Subject Name: " + database.getSubjectName()); //calling subject name
		System.out.println("Number of student: " +database.getNumberOfStudent()); //calling number of student
		System.out.println("Student Name:");
		//array the method getStudent so it can store all the return from method getStudent
		String[] temp = database.getStudent();
        for(int i = 0;i<name.length;i++){
         	System.out.println(temp[i]);
        }
        
        System.out.println(); //new lines
  
        Subject oop = new Subject("Object-Oriented Programming"); //oop object pass to cons 1args
        String[] name1 = {"Gopal Raju","Ying Tan"}; //name set to array for passing to array
        oop.addStudent(name1); //name sent to addStudent method
        System.out.println("Subject Name: " + oop.getSubjectName()); //calling subject name
	  	System.out.println("Number of student: " +oop.getNumberOfStudent()); //calling number of student
		System.out.println("Student Name:");
		//array the method getStudent so it can store all the return from method getStudent
		String[] temp1 = oop.getStudent();
		for(int i =0;i<name1.length;i++){
			System.out.println(temp1[i]);
		}
	}
}