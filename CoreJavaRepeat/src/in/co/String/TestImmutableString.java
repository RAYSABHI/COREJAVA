package in.co.String;

public class TestImmutableString {
	public static void main(String[] args) {
		
		ImmutableString s = new ImmutableString(20, 30);
		
		System.out.println("length: " +s.getLength());
		System.out.println("width : " +s.getWidth());
		System.out.println("total area : " +s.area());
	}

}
