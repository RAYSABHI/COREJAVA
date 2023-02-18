package in.co.ExerciseJavaBasics;

public class Question11 {
	public static void main(String[] args) {
		
		// Whether Number is prime or not
		int P = 4;
		 int n = 0;
		 int m = P/2;
		 
		 for (int i =2; i<=m; i++) {
	     if (P%i==0) {
	    	 n++;
	    // break;
	     }
	     }
		if (n==0) {
	     System.out.println("Given number is prime");
		 }
	     else {
	     System.out.println("number is not prime");	 
		 }
		 }
		 }
