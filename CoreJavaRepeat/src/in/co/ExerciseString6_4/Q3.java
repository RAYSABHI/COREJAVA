package in.co.ExerciseString6_4;

public class Q3 {
	public static void main(String[] args) {
		
		String name = "Vijay Chauhan";
		
		char a ='a';
		int sum =0;
		for( int i = 0; i<name.length(); i++) {
			if (name.charAt(i)==a) {
				sum++;
				
			}
		}
		System.out.println(sum);
		
	}

}
