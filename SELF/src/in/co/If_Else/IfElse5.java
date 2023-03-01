package in.co.If_Else;

public class IfElse5 {
	public static void main(String[] args) {
		
		int number = 15;
		
		if (number%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		//Using ternory Operator
		
		System.out.print("using Ternory : ");
		int number1 = 15;
		
		String output = (number1 % 2==0)?"Even Number QuestionMark Condition" : "Odd Number";
		System.out.println(output);
		
	}

}
