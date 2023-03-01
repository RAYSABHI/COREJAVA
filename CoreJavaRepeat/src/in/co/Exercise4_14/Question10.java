package in.co.Exercise4_14;

public class Question10 {

	public static void main(String[] args) {
		
		int num= 153;
		int r;
		int sum = 0;
		int n = num;
		while (n>0) {
			r = n%10;
			sum = sum + (r*r*r);
			n = n/10;
		}
		if (sum == num) {
			System.out.println("number is Armstrong");
		}
		else {
			System.out.println("number is not Armstrong");
		}
	}
}
