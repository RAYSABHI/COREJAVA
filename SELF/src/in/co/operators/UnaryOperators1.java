package in.co.operators;

public class UnaryOperators1 {
	
	// here increment amd decrement is as operators
	
	public static void main(String[] args) {
		
		// example of post increment and decrement
		int x= 10;
		
		System.out.println(x++); // result 10
		System.out.println(x);   // result 11
		System.out.println(x--); // result 11

		int y = 15;
		int y2 = y--;
		System.out.println(y++); //result 15
		System.out.println(y2);  // result 15
		System.out.println(y); //result 16
		
		//from here example of pre increment & decrement
		
		int a = 10;
		System.out.println(++a); // result 11
		
		int b = 10;
		System.out.println(--b);  // result 9
		
	}

}
