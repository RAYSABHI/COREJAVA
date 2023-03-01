package in.co.ExceptionalHanding;

public class TestLoginException {
	public static void main(String[] args) {
		
		String name = "admin";
		
		if (name.equals("admin")) {
			System.out.println("valid user name");
		}
		else try {
			throw new LoginException();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
