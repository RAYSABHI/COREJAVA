package in.co.ExceptionalHanding;

public class Example_tryCatch {
	public static void main(String[] args) {
		
		int a =50;
		int b = 0;
		int data;
		
		try {
			data = a/b;  // here exception throws
		}
		
		// handling the exception
		catch (Exception e) {
			System.out.println(a/(b+2));
		}
	}

}
