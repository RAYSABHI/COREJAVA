package in.co.rays;

public class JavaExercise2 {
	public static void main(String[] args) {
	
	// Q.7
	//	int sum = 0;
	//	for (int i=101; i<200; i++) 
    //	{ 
	//	if (i%7==0)
	//	{
	//	sum = sum +i;
	//	}
	//	}
	//	System.out.println("Greater than 100 and less than 200,sum of  all the integer Numbers is : "+ sum);
	
		
	// Q.9 
	 for(int i=1;i<=4;i++) 
	 { for(int j=1;j<=i;j++)
	// { for (int k=1;k<=j;k++)
	 { System.out.print("   " +i); }
				  
	  System.out.println("");
	  }
	 
	 // Q.10 Check Armstrong number
	 int first_number = 153;
	 int second_number = 153;
	 int checking =0;
	 
	 while (first_number>0)
	 {
	 int digit = first_number%10;
    checking =(digit * digit * digit) + checking;
    first_number = first_number/10;
	 }
	 
	 if (checking == second_number) {
	 System.out.println("number is Armstrong");
	 }
	 else {
	 System.out.println("Given number is not Armstrong");
	 }
	 
	 // Q.11 Check Prime number
	 int pn =25;
	 int n=0;
	 int m = pn/2;
	 
	 for (int i =2; i<=m; i++) {
     if (pn%i==0) {
    	 n++;
     break;
     }
     
     }
	 
	 
	 if (n==0) {
     System.out.println("Given number is prime");
	 }
     else {
     System.out.println("number is not prime");	 
	 }
	
	// Q.13 Harmonic series
	
	 int num = 5 ;
	 double sum = 0.0;
	 
	 for (int i =1; i<=num; i++) {
		 System.out.println("/" +i+"+");
		 sum = sum+(double)1/i;
	 }
	 System.out.println("harmonic series: " + sum);

	
	// Q.15 largest number
	 
	 int arr[] = {15,25,200,100,10,50};
	 int max = arr [0];
	 
	 for (int i =0; i<arr.length; i++) {
		 if(arr[i]>max) {
			 max =arr[i];
		 }
	 }
	 System.out.println( "largest element is :" + max);
		 
	
	// Q.17Missing element
	 
	 int arr1[]= {1,2,4,3};
	 int arr2 []= {1,2,4};
	 
	 for (int i =0; i<arr1.length; i++) {
		 int count = 0;
		 for (int j=0; j<arr2.length; j++) {
			 if (arr1[i]==arr2[j]) {
				 count++;
			 }
		 }
		 if (count==0) {
		 System.out.println("missing element is : " +arr1[i]);
	
		 
		 // Q.18 positive integer in descending order
		 
		 int arr3[]= {10,9,8,7,6,1};
		 int element = 1;
		 int position= 0;
		 
		 for (int k=0; k<arr3.length; k++) {
			 if (arr3[i] == element) {
				 position =k;
				 break;
			 }
			 else {
				 position = -1;
			 }
			 }
		 System.out.println("position of element is: " + position);
		 
	}
	}

	 
	
	
	}
	}
    

    
    
	
 	