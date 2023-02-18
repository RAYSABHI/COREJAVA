package in.co.ExerciseJavaBasics;

public class Question7 {
	public static void main(String[] args) {
		
		int sum = 0;
			for (int i=100; i<200; i++){ 
			if (i%7==0)
			{
			System.out.println("numbers which are divisible by 7 :- "+ i + " ");
			
			sum = sum +i;
			}
			}
			System.out.println("Greater than 100 and less than 200,sum of  all the integer Numbers is : "+ sum);
		

	}

}
