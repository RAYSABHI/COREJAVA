package in.co.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorList {
public static void main(String[] args) {
	
	Vector v = new Vector();
	v.add("one");
	v.add("two");
	System.out.println(v);
	
	// print through iterator
	
	Iterator it = v.iterator();
	while (it.hasNext()) {
		String str = (String) it.next();
		System.out.println(str);
			}
	System.out.println("After Enumeration");
	// prints all elements by enumerator
	Enumeration en = v.elements();
	while (en.hasMoreElements()) {
		String str = (String) en.nextElement();
		
		System.out.println(str);
	}
	
	
	
	
}
}
