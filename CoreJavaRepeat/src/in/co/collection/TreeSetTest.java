package in.co.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet s = new TreeSet();
		s.add("zero");
		s.add("one");
		s.add("two");
		s.add("three");
		System.out.println("normally print : "+s);
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println("after iterator: " +str);
		}
		
		
		
		
	}

}
