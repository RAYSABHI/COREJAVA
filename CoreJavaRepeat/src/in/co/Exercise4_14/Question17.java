package in.co.Exercise4_14;

public class Question17 {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50,60};
		
		int sum1=0, sum2=0;
		
		for (int i =1; i<a.length;i++) {
			sum1 = sum1+a[i];
		}
		
		for (int j =1; j<b.length;j++) {
			sum2 = sum2+b[j];
		}
		
		int missingValue = sum2 - sum1;

		System.out.println( "MissingValue of array B: " + missingValue);
}
}
