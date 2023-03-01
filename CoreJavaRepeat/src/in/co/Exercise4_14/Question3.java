package in.co.Exercise4_14;

public class Question3 {
	public static void main(String[] args) {
		
		// Generate five Random Integer
		
		int  a= 100;
		
		for (int i=94; i<100;i++) {
			System.out.println(i + " ");
		}
		
		// Second Way
		for (int i=1; i<=5;i++) {
			System.out.println((int)(Math.random()*100));
		}
	}

}
