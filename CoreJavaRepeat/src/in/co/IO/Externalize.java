package in.co.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Externalize implements Externalizable {

	public  String  name = null;
	public int maths = 0;
	public int physics = 0;
	public int chemistry = 0;
	public transient int total = maths + physics + chemistry;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeObject(physics);
		out.writeObject(chemistry);
		out.writeObject(maths);
		out.writeObject(total);  // transient variable
	}
		
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		physics = in.readInt();
		chemistry = in.readInt();
		maths = in.readInt();
		total = in.readInt();
	
	}
	
	
	
	
	
	
}
