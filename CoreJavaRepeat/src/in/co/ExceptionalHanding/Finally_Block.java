package in.co.ExceptionalHanding;

public class Finally_Block {
	public static void main(String[] args) {
		
		try {
			System.out.println("before exception");
			
			int data = 25/0;
			System.out.println(data);
		}
		catch (ArithmeticException e ) {
			System.out.println("Exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("finally block always executed");
		}
		System.out.println("rest of code");
	}

}
