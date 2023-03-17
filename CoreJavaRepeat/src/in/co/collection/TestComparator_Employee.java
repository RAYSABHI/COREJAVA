package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator_Employee {
	public static void main(String[] args) {
		
		Comparable_Employee e1 = new Comparable_Employee("ram", "indore", "02/06/2005");
		Comparable_Employee e2 = new Comparable_Employee("aam", "indore", "02/06/2005");
		Comparable_Employee e3 = new Comparable_Employee("Shyam", "ujjain", "02/06/2006");	
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		Collections.sort(list);
		for (Object o1 : list) {
			System.out.println(o1);}
		//System.out.println(list);
		
		
	}

}
