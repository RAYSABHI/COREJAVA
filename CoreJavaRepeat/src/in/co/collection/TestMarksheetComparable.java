package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheetComparable {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(new Marksheet("50", "Apple", 90));
		a.add(new Marksheet("20", "Boy", 80));
	a.add(new Marksheet("30", "Cat", 70));
	
	System.out.println(a);
	System.out.println();
	
	System.out.println("After Sorting : ");
	Collections.sort(a);
	for (Object object : a) {
		System.out.println(object);
	}
	System.out.println();
	System.out.println("Comparator");
	OrderByName cName = new OrderByName();
	Collections.sort(a, cName);
	
	for (Object o : a) {
		System.out.println(o);
	}
	
	}
}
