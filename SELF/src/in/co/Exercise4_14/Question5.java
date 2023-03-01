package in.co.Exercise4_14;

public class Question5 {
	public static void main(String[] args) {
		 // reverse number
		
		int num1 = 12345;
		int rm =0;
		int reverse=0;

		while(num1>0) {
			rm = num1%10;
			reverse = reverse*10+rm;
			num1= num1/10;
			
		}
		System.out.println(reverse);
		
		
		
		
		
		
		
		
		
		
		
	}

}
