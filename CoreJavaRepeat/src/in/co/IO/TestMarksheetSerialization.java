package in.co.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestMarksheetSerialization {
public static void main(String[] args) throws Exception{
	
	FileOutputStream file = new FileOutputStream("C:\\Users\\Anand\\Eclipse_workspace\\CoreJavaRepeat\\serialization.txt");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	Marksheet_Serialization m= new Marksheet_Serialization();
	
	m.name="raju";
	m.chemistry=75;
	m.physics=80;
	m.maths=85;
	
	out.writeObject(m);
	
	
}
}
