package in.co.rays.exceptionalHandling;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {
		
		TestLoginException t = new TestLoginException();
		
		try {
			t.authenticate ("admin");
			System.out.println("No Exception Found");
		}
		
		catch (LoginException e) {
			System.out.println("User Access Denied");
		}
		
		finally {
			System.out.println("this is finally block");
		}
		}
		

		public void authenticate (String name) throws LoginException {
			
			if (!"admin".equals(name)) {
				
				LoginException e = new LoginException();
				throw e;
			}
			}
			}
