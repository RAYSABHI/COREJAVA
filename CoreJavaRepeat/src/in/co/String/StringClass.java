package in.co.String;

public class StringClass {
	public static void main(String[] args) {
		
		String s = "Vijay Dinanath Chauhan";
		
		System.out.println(s);
		System.out.println("String length: " + s.length()); // length of String
		
		System.out.println("7th character: "+ s.charAt(6)); // position of char
		
		System.out.println("index of Dina: "+ s.indexOf("Chauhan")); // start of index
		
		System.out.println("1# pos of i: "+ s.indexOf("D")); // index position
		
		System.out.println("last position of i: "+ s.lastIndexOf("a")); // last position of any index in string
		
		System.out.println("a is replaced by b: "+ s.replace("a", "b")); // for replace of char
		
		System.out.println("lower name : "+ s.toLowerCase()); // for lower case
		
		System.out.println("upper name: "+ s.toUpperCase()); //for upper case
		
		System.out.println("Start with vijay: "+ s.startsWith("Dinanath")); // check true false
		
		System.out.println("Dad's name: "+ s.substring(6)); // start from that char
	}

}
