package in.co.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestMarksheet_Deserialization {
public static void main(String[] args) throws Exception{
	
	FileInputStream file = new FileInputStream("C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\serialization.txt");
	ObjectInputStream in = new ObjectInputStream(file);
	
	Marksheet_Serialization m = (Marksheet_Serialization)in.readObject();
	System.out.println("name : "+m);
}
}
