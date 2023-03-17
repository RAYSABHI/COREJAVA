package in.co.Programs;

public class FibonacciSeries {
public static void main(String[] args) {
	
	
	int a = 0; int b = 1 ; int c = 0;
	int sum;
	int count = 10;
	System.out.print(a+" "+b); //printing a and b;
	
	for (int i =2;i<=count; i++) {
		c = a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		}
	System.out.println();
	
	sum = c;
	System.out.println("Sum of all fibonacci numbers upto 10 : " +sum);
	
	
	
	
	
}
}
