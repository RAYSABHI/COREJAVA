package in.co.ExceptionalHanding;

public class MultipleCatch {
	public static void main(String[] args) {
		
		String name =null;
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6)); // here only 0 to 4 charater
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti hai");
		}
		catch (NullPointerException e) {
			System.out.println("name is not available");
		}
		finally {System.out.println("good name");
		}
	}

}
