package in.co.rays.exceptionalHandling;

public class String {
public static void main(String[] args) {
	
	String name ="shyam";
	
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(3));
	}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("String length is small");
		e.printStackTrace();
	}
	catch (NullPointerException e) {
		System.out.println("Null Data or Empty Data");
		e.printStackTrace();
	}
	
	finally { 
		System.out.println("Pandit hu mai");
		
	}
}
}
