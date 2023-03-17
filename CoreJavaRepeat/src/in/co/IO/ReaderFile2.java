package in.co.IO;

import java.io.FileReader;

public class ReaderFile2 {
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\src\\in\\co\\IO\\rays.txt");
		
		int ch = f.read();
		while (ch!=-1) {
			System.out.print((char) ch);
			ch = f.read();
		}
		
	}

}
