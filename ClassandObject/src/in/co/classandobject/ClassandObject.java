package in.co.classandobject;

public class ClassandObject {
	public static void main(String[] args) {
		
		// static method
		int n=3;
		int m=3;
		
		int value = ClassandObject.sum(n,m); // this is for addition *same for all arithematics
	System.out.println(value);
	}
	
	
public static int sum (int a, int b) {
	return a+b;
}

}
