package in.co.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestMarksheetSorting {
	public static void main(String[] args) {
		
		ArrayList marksheets =new ArrayList();
		
		marksheets.add(new Marksheet("A4","Sakshi S",89));
		marksheets.add(new Marksheet("A2","P Sindhu",90));
		marksheets.add(new Marksheet("A3","Saina N",80));
	
		// sort elements by comparable.
		Collections.sort(marksheets);
		// print all elements
	for (Object o : marksheets) {
		System.out.println(o);
	}
	}

}
