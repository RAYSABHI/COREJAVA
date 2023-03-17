package in.co.IO;

import java.io.File;
import java.util.Date;

public class File_Attributes {
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\abc.txt");
		
		// check if file exsists
		if(f.exists()) {
			System.out.println("name: "+f.getName());
		
			//Path of file 
			System.out.println("Path: "+f.getAbsolutePath());
			
			// check access Permission
			System.out.println("Writable: "+f.canWrite());
			System.out.println("Readable: "+f.canRead());
			
			// check directory / file
			System.out.println("Is file : "+ f.isFile());
			System.out.println("is direc: "+ f.isDirectory());
			
			// last modified date
			Date d = new Date(f.lastModified());
			System.out.println("date modified last: "+ d);
			
			// length of file
			long length =f.length();
			System.out.println("length: "+ length+ "bytes");
			
		}else {
			System.out.println("file does not exist");
		}
	}

}
