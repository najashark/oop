package my.edu.unikl.test;
import my.edu.unikl.assignment1.*;
public class SubjectTest {

	public static void main(String[] args) {
		//Create 2 object of subjects with the name of Database system 
		//and Object-oriented programming
		Subject subject1 = new Subject("Database system");
		Subject subject2 = new Subject("Object-oriented programming");
		
		String student1 = new String("Ali Abu");
		String student2 = new String("Atan Aton");
		String student3 = new String("Lina Tan");
		String student4 = new String("Gopal Raju");
		String student5 = new String("Ying Tan");
 
		//Add 3 names, Ali Abu, Atan Aton and Lina Tan for the database system.
		subject1.addStudent(student1);
		subject1.addStudent(student2);
		subject1.addStudent(student3);
		
		//Add 2 names, Gopal Raju and Ying Tan for the object-oriented programming
		subject2.addStudent(student4);
		subject2.addStudent(student5);
		
		//Print the student name and the number of students in each subject.
		System.out.println("No. of Student in db:"+subject1.getStudentNum());
        /*for (int i = 0; i < student.length; i++) //Loop for array output
        {
            student[i].displayArrayStudent(); //Call displayArrayStudent method to output
        }*/
		//System.out.println("Name of Student in db:"+subject1.getArrayStudent());
		
		System.out.println("No. of Student in oop:"+subject2.getStudentNum());
		//System.out.println("Name of Student in oop:"+subject1.getArrayStudent());
		

	}

}
