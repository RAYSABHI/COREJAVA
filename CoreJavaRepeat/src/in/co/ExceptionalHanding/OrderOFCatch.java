package in.co.ExceptionalHanding;

public class OrderOFCatch {
	public static void main(String[] args) {
		
		String name = "vijay";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("string index is not complete");
		}
		
		catch (RuntimeException e) 			// here RuntimeException is as parent class
		{
			System.out.println("runtime exeption message" + e.getMessage());
		}
	}

}
