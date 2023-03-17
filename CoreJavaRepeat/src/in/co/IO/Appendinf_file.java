package in.co.IO;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Appendinf_file {
	public static void main(String[] args) throws Exception{
		
		FileWriter file = new FileWriter("C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\123.txt",true);
		PrintWriter pw = new PrintWriter(file,true);
		
		pw.write("****************");
		pw.write("+++++++++++++++++");
		
		file.close(); pw.close();
	}

}
