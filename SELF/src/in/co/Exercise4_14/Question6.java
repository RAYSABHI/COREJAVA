package in.co.Exercise4_14;

public class Question6 {
	public static void main(String[] args) {
		
		// fibonacci series
		
		int n1 = 0;
		int n2 = 1;
		int number = 10;
		int sum=0;
		
		System.out.print(n1 + " "+n2);
		
		 for (int i = 2; i<=number; i++) {
			sum = n1+n2;
			System.out.print(" " +sum);
			 n1=n2;
			 n2=sum;
			
		 }
		
		
		
		
		
		
	}

}
