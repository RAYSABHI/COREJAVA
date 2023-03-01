package in.co.Exercise4_14;

public class Question8 {
	public static void main(String[] args) {
		
		int [][]table;
		table = new int [11][11];
		for (int i =1; i<table.length; i++) {
			for (int j=2; j<table.length;j++) {
				table[i][j] = i*j;
				System.out.print(table [i][j] +"\t");
			}
			System.out.println();
		}
		
	}

}
