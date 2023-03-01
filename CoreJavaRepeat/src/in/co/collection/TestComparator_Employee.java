package in.co.collection;

public class TestComparator_Employee {
	public static void main(String[] args) {
		
		Comparator_Employee e1 = new Comparator_Employee("ram", "indore", "02/06/2005");
		Comparator_Employee e2 = new Comparator_Employee("ram", "indore", "02/06/2005");
		Comparator_Employee e3 = new Comparator_Employee("Shyam", "ujjain", "02/06/2006");	
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}

}
