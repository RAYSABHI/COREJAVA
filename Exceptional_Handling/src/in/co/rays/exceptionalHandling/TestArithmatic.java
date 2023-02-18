package in.co.rays.exceptionalHandling;

public class TestArithmatic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = 15;
		
		try {
			int value = j/i;
			System.out.println(value);
		}
		catch (Exception e) {
			// Todo Auto generated method stub
			
			System.out.println("Divided byzero");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("finally block");
		}
	}
}


