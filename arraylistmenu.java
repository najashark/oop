//Write the program to display a MENU for Arraylist operations. allow usser to select any of the options in the menu
//then carry out the arraylist's operation required. the user can continue perform other selection on the menu
//until he/she chooses to quit from system

package my.edu.unikl.lo1;
import java.util.*;

public class ArrayListExe {

	public static void main(String Args[]){
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("egg");
    	myList.add("cabbage");
    	myList.add("spoon");
    	myList.add("fork");
    	myList.add("knife");
		int menuOption = 0;
        do {
        	
        	menuOption = showMenu();
        	@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
        	
		switch (menuOption)
		{     
	        case 1:
	        	System.out.print("Enter your element (ex:bottle):");
	        	String element = input.next();
	        	myList.add(element);
	        	System.out.print("Your element "+element+" has been added.\n");
	        	for(int i = 0; i < myList.size(); i++)
	        		System.out.println(myList.get(i));
	        	System.out.print("\nPress 'Y' key to continue:");
	        	String cont = input.next();
	        	if (cont=="Y"){
	        	showMenu();}
	        	break;		
		
	        case 2:
	        	System.out.println("The size is:"+myList.size() );
	        	for(int i = 0; i < myList.size(); i++)
	        		System.out.println(myList.get(i));
	        	System.out.print("\nPress 'Y' key to continue:");
	        	String cont1 = input.next();
	        	if (cont1=="Y"){
	        	showMenu();}
	        	break;
		
	        case 3:
	        	System.out.print("which index you want to display (ex:0-"+(myList.size()-1)+"):");
	        	int index = input.nextInt();
	        	System.out.println(myList.get(index));
	        	System.out.print("\nPress 'Y' key to continue:");
	        	String cont2 = input.next();
	        	if (cont2=="Y"){
	        	showMenu();}
	        	break;
		
	        case 4:
	        	System.out.print("Enter element you want to update (ex:bottle):");
	        	String update = input.next();
	        	System.out.print("which index you want to be updated (ex:0-"+(myList.size()-1)+"):");
	        	int index1 = input.nextInt();
	        	myList.set(index1, update);
	        	for(int i = 0; i < myList.size(); i++)
	        		System.out.println(myList.get(i));
	        	System.out.print("\nPress 'Y' key to continue:");
	        	String cont3 = input.next();
	        	if (cont3=="Y"){
	        	showMenu();}
	        	break;
		
	        case 5:
	        	System.out.print("Enter element you want to add (ex:bottle):");
	        	String add = input.next();
	        	System.out.print("which index you want to be insert (ex:0-"+(myList.size()-1)+"):");
	        	int i1 = input.nextInt();
	        	myList.add(i1, add ) ;	        	
	        	for(int i = 0; i < myList.size(); i++)
	        		System.out.println(myList.get(i));
	        	System.out.print("\nPress 'Y' key to continue:");
	        	String cont4 = input.next();
	        	if (cont4=="Y"){
	        	showMenu();}
	        	break;
		
		
	        case 6:
	        	System.out.print("Which index you want to be delete (ex:0-"+(myList.size()-1)+"):");
	        	int index2 = input.nextInt();
	        	myList.remove(index2);
	        	for(int i = 0; i < myList.size(); i++)
	        		System.out.println(myList.get(i));
	        	System.out.print("\nPress 'Y' key to continue:");
	        	String cont5 = input.next();
	        	if (cont5=="Y"){
	        	showMenu();}
	        	break;
		
	        case 7:
	        	System.out.print("Enter element you want to search (ex:egg):");
	        	String search = input.next();
	        	System.out.println("Your element is on index " +myList.indexOf(search));
	        	System.out.print("\nPress 'Y' key to continue:");
	        	String cont6 = input.next();
	        	if (cont6=="Y"){
	        	showMenu();}
	        	break;
		
	        case 8:
	        	for(int i = 0; i < myList.size(); i++)
	        		System.out.println(myList.get(i));
	        	System.out.print("\nPress 'Y' key to continue:");
	        	String cont7 = input.next();
	        	if (cont7=="Y"){
	        	showMenu();}
		
		}//end switch
        } while (menuOption != -1);
	}//end main

	public static int showMenu() {

		int option = 8;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("\nARRAYLIST OPERATION");
		System.out.println("-------------------\n");
		System.out.println("1) Add at the back");
		System.out.println("2) Determine the number of elements");
		System.out.println("3) Display the element at the specified index");
		System.out.println("4) Update the element at the specified index");
		System.out.println("5) Add element at the specified index");
		System.out.println("6) Remove element at the specified index");
		System.out.println("7) Search for the specific element");
		System.out.println("8) Print all the elements");
		
		System.out.print("Please enter your options(ex:1-8)(-1 to stop):");
		option = input.nextInt();

        return option;

    }// End of showMenu
}//end class
