package in.co.Exercise4_14;

public class Question15 {
	public static void main(String[] args) {
		
		int array [] = {230,250,67,89,56};
		firstmethod(array);
		

}

	private static void firstmethod(int[] array) {
		
		int max = array[0];
		for (int i=1; i<array.length;i++) {
			if  (array[i]>max) {
				max = array[i];
			}
		}
		System.out.println(max);
		
	}
}
