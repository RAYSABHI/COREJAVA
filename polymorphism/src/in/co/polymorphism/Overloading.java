package in.co.polymorphism;

// import java.net.SocketOption;

public class Overloading {
	public static void main(String[] args) {
		
		display (1);
		display(1,4);
		display ("hey","hii");
	}
	
	
	private static void display (int i, int j) {
		
	System.out.println("Arguments: " + i+"&"+j);
	}
	
	private static void display (int s) {
		System.out.println("arguments : "+ s);
	}
	
	private static void display (String s, String u) {
		System.out.println("Arguments : " + s
				);
		
	}
	}
	
