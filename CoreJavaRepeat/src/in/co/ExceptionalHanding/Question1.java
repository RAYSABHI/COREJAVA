package in.co.ExceptionalHanding;

public class Question1 {

	public static void main(String[] args) {
		
		try {
			int a = 50/0;
			
		}
		finally {
			System.out.println("final block");
		}
	}
}
// result here exception occurred, but final block print.