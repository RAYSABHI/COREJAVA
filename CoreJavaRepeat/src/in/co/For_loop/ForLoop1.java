package in.co.For_loop;

public class ForLoop1 {
	public static void main(String[] args) {
		
		for (int i =1; i<=20; i++) {
			//System.out.println(i);
			if(i==14) {
				break;
			}else if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
