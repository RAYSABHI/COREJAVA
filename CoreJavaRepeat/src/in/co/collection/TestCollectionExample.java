package in.co.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionExample {
public static void main(String[] args) {
	
	Collection c= new ArrayList();
	c.add("Bura mat Dekho");
	c.add("Bura mat Suno");
	c.add("Bura mat Kaho");
	c.add(25);
	
	System.out.println(c);
	System.out.println("length of collection : "+ c.size());

	for (Object ele : c) // print all element of collection
	{
		System.out.println(ele);
	}
	
	// convert collection into Array
	Object [] oArray = c.toArray();
	// Print all elements of array
	for (Object ele : oArray) {
		String s = (String) ele;  // only String value
		System.out.println(s);
	}
	
	
	}
	}
