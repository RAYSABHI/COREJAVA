package in.co.java_basics;

public class Methods {
public static void main(String[] args) {


	// instance method
	int m =2;
	int n = 3;
	Methods obj = new Methods (); // making object 
	int value = obj.sum1(n,m);
	System.out.println(value);
	}
	public int sum1(int a,int b) {
		return a+b;
		
	}
}
	



