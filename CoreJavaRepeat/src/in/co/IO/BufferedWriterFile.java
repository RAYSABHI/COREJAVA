package in.co.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterFile {
	public static void main(String[] args) throws Exception{
		
		FileWriter file = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(file);
		
		char[] cArray = {'H','i'};
		bw.write(cArray);
		bw.write(',');
		bw.write("SUNILOS");
		bw.close(); file.close();
		
	}

}
