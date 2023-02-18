package in.co.java_basics;

public class JavaBasics_2 {
	public static void main(String[] args) {
		
		// switch case
//		String month = "March";
//		
//		switch (month) {
//		case "January" :{
//			System.out.println(" First month January");
//			break;
//			}
//		
//		case "February" : {
//			System.out.println("Second month February");
//			break;
//			}
//		
//		case "March" :{
//			System.out.println("Third month March");
//			break;
//		   }
//			
//		default : {
//			System.out.println("invalid month");
//		}
//	
		// 	Loops
		// for increment
//		for (int i =1; i<=5;i++) {
//		for (int j=1; j<=i;j++) {
//		System.out.print("  "+j);	
//		}
//		System.out.println();
//		
//		}
		
		// for decrement
		for (int i = 4; i>0; i--) {
		for (int j = 4;j>=i; j--) {
		System.out.print("  " + j);}
		
		System.out.println();
		
		}
		
		// while increment 
		int A =0;
		while (A<5) {
		System.out.println(A + " hello");
		A++;
		
		}
		
		//reverse
		int num = 123 , rev =0;
		while (num!=0) {
			int digit = num%10;
			rev =rev*10 + digit;
			num = num/10;
		}
		System.out.println("reverse number is : " + rev);
		
	
		//armstrong with while
		
		int A1 =153, check=0, B =153;
		while (A1!=0) {
			int digit =A1%10;
			check = digit *digit *digit +check;
			A1 = A1/10;
			
		}
		
		if (check== B) {
			System.out.println("valid armstrong number");
		}
		else 
			System.out.println("not valid armstrong number");

				
		// Array
		
		int arr[] = {10,20,30,40,50};
		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("sum of array " + sum);
	
		// array copy
		
		char copyfrom[] = {'s','u','n','r','a','y','s'};
		char copyto[]= new char [3];
		System.arraycopy(copyfrom, 0,copyto,0,3);
		for(char c : copyto) {
			System.out.println(c);
			
		}
			
		}
		}
