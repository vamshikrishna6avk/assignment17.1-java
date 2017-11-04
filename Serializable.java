package conceptofSerialization;//created package as conceptofSerialization

/**
 * Serialization is a mechanism of writing the state of an object into a byte stream.
 * It is used to "mark" java classes so that objects of these classes may get certain capability.
 */
/*To serialize an object means to convert its byte stream so that the byte stream can be reverted back into a copy of the object*/
/**uses of serialization:used when we want to send  data over network or stored in files**/

//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly **/
import java.io.FileOutputStream;
/** FileOutputStream is an outputstream used for writing data to a file
 * writting primitive values into a file we use FileOutputStream **/
import java.io.IOException;/** it provides system input and output through data streams/serialization and file system
                            * commonly exceptions occurs druing execution of programm**/
import java.io.ObjectOutputStream;
/**Java ObjectOutputStream class enables to write java objects to an outputstream instead of just raw bytes **/

public class Serializable { // Creates class name as Seializable
	                        //classes are the basics of oops(object oriented programming language)
	public static void main(String[] args) { // Main class
		//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method,and to display
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter	

		                          // Creating Employee class object
		Employee nub = new Employee("Vamshi", "Krishna", 43252235);//taking objects

		try {//java try bloack is used to enclose the code that might throw an exception
			// Perform File Write operation
			FileOutputStream fout = new FileOutputStream("E:/Employee.txt");

			/* The ObjectOutputStream class is used to write primitive data
			   types and objects to an OutputStream.
			 */
			
			ObjectOutputStream out = new ObjectOutputStream(fout); // Perform File read operation
			out.writeObject(nub); // It provides the functionality to serialize
									// the object
			out.flush(); // Flushes the current output stream

			System.out.println("Sucess in Serialization concept");  //system is used to return code
		       //out is a static member
		       //println is used to print text and gives output
			// Prints success statement
																	
		} catch (IOException e) { //try block follows catch block, which handle the exception that occurs in associated try block
			//here main method will get the IOEception and needs to handle or declare it
			e.printStackTrace();//printStackTrace is a tool for diagnosing an exception,tells what happened and where in the code this happened
			//it is method of the class throwable of java.lang.packages,prints several lines in the output console
		}

	}

}
