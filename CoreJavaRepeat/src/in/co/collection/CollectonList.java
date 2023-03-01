package in.co.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectonList {
	public static void main(String[] args) {
		
		ArrayList c = new ArrayList();
		
		System.out.println(c.add("rays"));
		System.out.print(c.add("indore"));
		System.out.println((c.get(0)));
		System.out.println(c.get(1));
		c.clear();
		System.out.println(c.add(80));
		System.out.println(c.get(0));
		System.out.println(c.contains(80));
		System.out.println(c.containsAll(c));
		System.out.println(c.add(30));
		System.out.println(c.get(1));
		c.clear();
		//System.out.println(c.get(0));
		System.out.println(c.isEmpty());
		System.out.println(c.add(55));
		//System.out.println(c.retainAll(c));
		//System.out.println(c.iterator());
		
	}

}
