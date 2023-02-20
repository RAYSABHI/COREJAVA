package in.co.Exercise4_14;

public class Question5 {
	public static void main(String[] args) {
		
		// reverse digit 
		
		int a =12345;
		for (int i=5; i>=1;i--) {
			System.out.print(i);
		}
		System.out.println("  ");
		// second way
		String num = "12345";
		for (int i= num.length()-1; i>=0;i--) {
			System.out.print(num.charAt(i));
		}
	}

}
