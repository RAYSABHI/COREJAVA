package in.co.Programs;

public class PrimeNumber {
	public static void main(String[] args) {
		
		//Prime numbers are 1,3,5,7,11,13,17...
		
		int pnum = 6 ;
		int n=0;
		int d = pnum/2;
		
		for (int i=2; i<=d;i++) {
			if(pnum%i==0) {
			n++;
			}
			}
			if(n==0) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not Prime Number");
			}
		}
		
	}


