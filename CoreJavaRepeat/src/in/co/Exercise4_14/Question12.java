package in.co.Exercise4_14;

public class Question12 {
	public static void main(String[] args) {
		
		int num = 121;
		int remainder= 0;
		int sum = 0;
		int n = num;
		
		while (n>0) {
			remainder = n%10;
			sum = (sum*10) + remainder;
			n=n/10;
			
		}
		if (num==sum) {
			System.out.println("number 121 is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
		
		
		
		
	}

}
