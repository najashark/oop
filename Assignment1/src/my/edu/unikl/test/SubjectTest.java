package my.edu.unikl.test;
import my.edu.unikl.assignment1.*;

public class SubjectTest {

	public static void main(String[] args) {
		//Create 2 object of subjects with the name of Database system 
		//and Object-oriented programming
		Subject database = new Subject("Database system");
		Subject oop = new Subject("Object-oriented programming");
		
		//Add 3 names, Ali Abu, Atan Aton and Lina Tan for the database system.
		String[] name = {"Ali Abu","Atan Aton","Lina Tan"};
		database.addStudent(name);
		
		//Add 2 names, Gopal Raju and Ying Tan for the object-oriented programming
		String[] name1 = {"Gopal Raju","Ying Tan"};
		oop.addStudent(name1);

		
		//Print the student name and the number of students in each subject.
		System.out.println("No. of Student in "+database.getSubjectName()+" : "+database.getStudentNum());
		System.out.println("Student Name : ");
		
		//array the method getStudent so it can store all the return from method getStudent
		String[] temp = database.getArrayStudent();
		for(int i =0;i<name.length;i++)
		{
			System.out.println(temp[i]);
		}
		
		System.out.println("\nNo. of Student in "+oop.getSubjectName()+" : "+oop.getStudentNum());
		System.out.println("Student Name : ");
		String[] temp1 = oop.getArrayStudent();
		for(int i =0;i<name1.length;i++)
		{
			System.out.println(temp1[i]);
		}
		

	}

}
