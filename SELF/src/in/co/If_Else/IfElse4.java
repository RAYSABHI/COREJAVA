package in.co.If_Else;

public class IfElse4 {
public static void main(String[] args) {
	
	//Leap year (if year is divisible by 4 and  400, also not by 100)
	
	int year = 2024;
	
	if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
		System.out.println("LEAP YEAR");
	}
	else {
		System.out.println("COMMON YEAR");
	}
	
}
}
