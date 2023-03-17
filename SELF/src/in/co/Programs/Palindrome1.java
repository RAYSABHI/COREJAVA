package in.co.Programs;

public class Palindrome1 {
public static void main(String[] args) {
	
	int num = 152;
	int r;
	int sum=0;
	int m=num;
	
	while(num>0) {
		r= num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	if(m==sum) {
		System.out.println("Given number is Palindrome");
	}else {
		System.out.println("Number is not Palindrome");
	}
	
	
}
}
