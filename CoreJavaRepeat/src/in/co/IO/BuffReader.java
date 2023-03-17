package in.co.IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffReader {
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\src\\in\\co\\IO\\buff.txt");
		
		BufferedReader b = new BufferedReader(f);
		
		String line = b.readLine();
		
		while(line !=null) {
			System.out.println(line);
		
		line = b.readLine();
		}
		
 		
		
	}

}
