package in.co.String;

public class StringBuffer1 {
	public static void main(String[] args) {
		
		// string buffer
		StringBuffer sb = new StringBuffer("This is java + ");
		
		
		//System.out.println(sb.append("Java is OOP")); // adding to string
		
		// System.out.println(sb.insert(0, 6)); // insert integer value at position
		
		 //System.out.println(sb.delete(0, 7));
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.capacity()); // capacity as per the system
		
	}

}
