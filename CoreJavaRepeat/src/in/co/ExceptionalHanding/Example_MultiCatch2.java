package in.co.ExceptionalHanding;

public class Example_MultiCatch2 {
	public static void main(String[] args) {
		
		// here is an example of null pointer error, but not provided type of corresponding error
		try {
			String s = null;
			System.out.println(s.length());
		}
		
		catch (ArithmeticException e) {
			System.out.println("arithmetic exception");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound exception");
		}
		
		catch (Exception e) {
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code");
	}

}
