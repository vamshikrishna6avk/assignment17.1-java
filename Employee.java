package conceptofSerialization;//created package as conceptofSerialization

/**
 * As mentioned in the assignment,
 * Create an Employee class with three properties:
 *firstName
 *lastName
 *serialVersionUID
 *and Save the Employee class object in ‘employee.txt’ file.
 */
import java.io.Serializable;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directl
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationa

//Creates the class and extend it with Serializable the interface.
//If a class implements serializable then all its sub classes will also be serializable.
public class Employee implements Serializable {//created class name as Employee implements Serializable
                                               //classes are the basics of opps(object oriented programming language)
//NOTE: The String class and all the wrapper classes implements Serializable interface by default.	
	// Declaring Employee class variable the variable 
	String firstName = null;//firstName 
	String lastName = null;//lastName
	private static long serialVersionUID;
	/**here serialization runtime associates with each serializable class a version number called as serialVersionUID
	 * private:we cannot use this variable in other class
	 * static:no need to create object to call this variable
	 * final:we cannot change the variable value
	 * long:type of variable if we use long we need to declare L
	 * serialVersionUID:variable name**/
	
	//Creating method 
	public Employee(String firstName, String lastName, long serialVersionUID) {//Here public is a access modifier which defines who can access this method
		
		// Gives reference to the objects 
		this.firstName = firstName; //firstName
		this.lastName = lastName;//lastName
		this.serialVersionUID = (long) serialVersionUID;//serialVersionUID
	}

	public String employeeStat() {//Here public is a access modifier which defines who can access this method
		//String[]args means arguments will be passed into main method and says that main() as a parameter	
		return "First Name: " + firstName + "Last Name: " + lastName + "ID" + serialVersionUID;//returns
	}

	

}