package in.co.IO;

import java.io.FileReader;
import java.util.Scanner;

public class ScannerReader1 {
public static void main(String[] args) throws Exception{
	
	FileReader f = new FileReader("C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\src\\in\\co\\IO\\sc.txt");
	Scanner sc = new Scanner(f);
	
	while(sc.hasNext()) {
		String line = sc.nextLine();
		System.out.println(line);
	}
	
}
}
