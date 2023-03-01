package in.co.operators;

public class LogicalOperators {
	public static void main(String[] args) {
		
		int a = 25;
		int b = 50;
		int c = 75;
		int d = 100;
		
		// for logical AND
		System.out.println("LOGICAL AND : ");
		System.out.println((b>a) && (d>c));
		System.out.println((a>b) && (c>d));
		System.out.println((a<b) && (c>d));
		
		System.out.println();
		// for logical OR
		System.out.println("LOGICAL OR : ");
		System.out.println((b>a) || (d>c));
		System.out.println((a>b) || (c>d));
		System.out.println((a<b) || (c>d));
		
		System.out.println();
		
		// logical NOT (reverse the result value
		System.out.println("LOGICAL NOT : ");
		System.out.println(!(a>b));
		System.out.println(!(d>c));
		
	}

}
