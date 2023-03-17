package in.co.collection;

import java.util.Comparator;

public class Marksheet implements Comparable<Marksheet>{
	
	public String rollNo;
	public String name;
	public int marks;
	
	public Marksheet (String rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name =name;
		this.marks= marks;
		}
	@Override
	public String toString() {
	
		return rollNo+ " "+name+" "+marks;
	}
	@Override
	public int compareTo(Marksheet o) {
		
		return rollNo.compareTo(o.rollNo) ;}
	}

	class OrderByName implements Comparator<Marksheet> {

		@Override
		public int compare(Marksheet m1, Marksheet m2) {
		
			return m1.name.compareTo(m2.name);
		}
		
		
		
		
		
	}
