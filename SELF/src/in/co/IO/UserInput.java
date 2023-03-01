package in.co.IO;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		String s = "name";
		int a;
		
		Scanner obj = new Scanner(System.in); //making scanner class object
		System.out.println("enter name");
		
		s = obj.nextLine();
				System.out.println("name is : " + s);
				System.out.println("enter age");
		a= obj.nextInt();
		
		System.out.println( "age is " + a);
	}

}
