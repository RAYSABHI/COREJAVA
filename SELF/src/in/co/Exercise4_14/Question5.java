package in.co.Exercise4_14;

public class Question5 {
	public static void main(String[] args) {
		 // reverse number
		
		int num = 1546;
		int rm =0;
		int reverse=0;

		while(num>0) {
			rm = num%10;
			reverse = reverse*10+rm;
			num= num/10;
			
		}
		System.out.println(reverse);
		
		
		
		
		
		
		
		
		
		
		
	}

}
