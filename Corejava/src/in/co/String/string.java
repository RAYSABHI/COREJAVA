package in.co.String;

public class string {
	public static void main(String[] args) {
		
		// String s1 = "India vs England";
		// System.out.println(s1.charAt(0));
		// System.out.println(s1.lastIndexOf('E'));
		// System.out.println(s1.length());
		// System.out.println(s1.toLowerCase());
        // System.out.println(s1.toUpperCase());

	
		// String literal pool
		String s1 ="ram";
		String s2 = "ram";
				
		boolean result1 = (s1!=s2);
		System.out.println(result1);
		
		boolean result2 = (s1.equals(s2));
		System.out.println(result2);
		
		System.out.println("---------------------------------------");
		
		// ----------------------------------------------------------------------------
		
		// String Heap Memory
		
		String s3 = new String ("ram");
		String s4 = new String ("ram");
		
		boolean result3 = (s3 == s4);
		boolean result4 = (s3.equals(s4));
		
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println("--------------------------------------");
		
		// String Buffer :-
		
		StringBuffer sb = new StringBuffer ("Hello");
		System.out.println(sb);
	
		sb.append(", Howz you");
		System.out.println((sb));
		System.out.println("i am fine");
		
		System.out.println("-----------------------------------------");
		}
		}
