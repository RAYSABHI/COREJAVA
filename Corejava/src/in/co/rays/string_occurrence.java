package in.co.rays;

public class string_occurrence {
public static void main(String[] args) {
	
	// Q.3
	String s1 ="occurrence";
		
		
	 for (char i= 'a'; i<='z'; i++) {
		 int count =0;
	 for (int j=0; j<s1.length(); j++) {
		 if (i==s1.charAt(j)) {
			 count++;
			 
		 }
		 }
	 System.out.println(i+"="+count);
	 
	 
	 
	 }
	 }
}

