package in.co.collection;

import java.util.ArrayList;

public class ListInterface {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add(0, 55);
		System.out.println(a.get(0));
		a.add(1, "uttam ji");
		System.out.println(a.get(1));
		a.remove(0);
		System.out.println(a.get(0));
		a.add(34);
		
		a.set(1, 75);
		a.add(45);
		//a.add(45);
		System.out.println(a.get(0));
		System.out.println(a.indexOf(45));
		System.out.println(a.lastIndexOf(45));
		//System.out.println(a.get(0));
	}

}
