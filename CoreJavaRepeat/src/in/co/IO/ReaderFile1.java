package in.co.IO;

import java.io.FileReader;

public class ReaderFile1 {
	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\src\\in\\co\\IO\\hi.txt");

		int ch = in.read();
		while (ch != -1) {
			System.out.print((char) ch);
			ch = in.read();
		}

	}

}
