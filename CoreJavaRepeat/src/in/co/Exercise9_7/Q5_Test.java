package in.co.Exercise9_7;

import in.co.String.ImmutableString;

public class Q5_Test {
	public static void main(String[] args) {
		
		
		ImmutableString s = new ImmutableString(20, 30);
		
		System.out.println("length: " +s.getLength());
		System.out.println("width : " +s.getWidth());
		System.out.println("total area : " +s.area());
	}

}
