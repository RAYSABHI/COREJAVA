package in.co.Variables;

public class Variables {
	
	static int a = 10; // static variable outside the method with static keyword
	int b = 20;        // instance variable outside the method inside the class

	// start main method
	public static void main(String args[])
	{
	int c = 30; // local variable inside the main method

	Variables reference = new Variables(); // here object create for print the instance variable
	System.out.println(Variables.a);         // here static can be print by classname
	System.out.println(reference.b);      // print of instance with help of object
	System.out.println(c);               // print local variable directly 
	} 
	}



