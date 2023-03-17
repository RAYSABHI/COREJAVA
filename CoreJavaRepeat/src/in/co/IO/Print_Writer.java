package in.co.IO;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Print_Writer {
	public static void main(String[] args) throws Exception{
		
		FileWriter file = new FileWriter("123.txt");
		PrintWriter pw = new PrintWriter(file);
		
		pw.println("Line 1 ");
		pw.println("Line 2");
		
		pw.close();file.close();
		
		
	}

}
