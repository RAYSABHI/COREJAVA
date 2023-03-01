package in.co.ExceptionalHanding;

public class ThrowException {
	public static void main(String[] args) {
		
		int a = 50;
		int b = 0;
		
		try {
			int c =a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			}
	System.out.println("others");	
		
	}

}
