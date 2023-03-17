package in.co.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) throws Exception {
	
	FileWriter f = new FileWriter("Write.text");
	
	f.write('r');
	f.write('a');
	f.write('y');
	f.write('s');
	f.write("\t");
	f.write("This is File Writer Class");
	f.write("\n");
	f.write("IO topic");
	
	f.close();
	
	
	
	
	
	
	
}
}
