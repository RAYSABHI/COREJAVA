package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		l.add("zero");
		l.add("Two");
		l.add("Three");
		l.add("Five");
		System.out.println("collection List : " +l);
		
		l.add(3, "Four");  //insert at 4th index
		System.out.println("After adding four : "+ l);
	
		String val =(String) l.get(1);  // index at 1
		System.out.println("String index : "+val);
		
		// for print all elements
		for (Object ele : l) {
			String str = (String) ele;
			System.out.println(str);
		}
		
		// sort the list (descending order)
		Collections.sort(l);
		System.out.println(l);
		
		// Creates a sublist
		ArrayList sublist = new ArrayList(l.subList(1, 3));
		System.out.println(sublist);
		
		// convert to array
		Object[] nums = l.toArray();
		for (Object arr : nums) {
		String str1 = (String) arr;
		System.out.println("Array form : " +str1);
	}

}
}
