package in.co.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCollection {
	public static void main(String[] args) {
		
		ArrayList v = new ArrayList();
		v.add("jay");
		v.add("singh");
		
		Iterator it = v.iterator();
		
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
	}

}
