package in.co.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Binary_File {
	public static void main(String[] args) throws Exception {
		
		//creating object at new place wherever we have to create it 
		String source =  "C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\abhi.jpg";
		String target = "C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\abhinew.jpg";
		
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target); 
		
		int ch = in.read();
		while (ch!=-1) {
			out.write(ch);
			ch= in.read();
		}
		out.close(); in.close();
	}

}
