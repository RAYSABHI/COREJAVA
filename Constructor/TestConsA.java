package in.co.Constructor;

public class TestConsA {
	public static void main(String[] args) {
		
		ConsA c1 = new ConsA ("Sun", "Rays",1); // making object
		
		String fn = c1.getFname(); // assign new object 
		System.out.println(fn);
		
		//String ln = c1.getLname();
		System.out.println(c1.getLname());
		
		//int ID = c1.getId();
		System.out.println(c1.getId());
		
		
	}

}
