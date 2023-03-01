package in.co.collection;

public class TestEmployee_HashCode {
	public static void main(String[] args) {
		
		Employee_Hashcode e1 = new Employee_Hashcode("ram", "indore");
		Employee_Hashcode e2 = new Employee_Hashcode("ram","indore");
		Employee_Hashcode e3 = new Employee_Hashcode("shyam", "ujjain");
		Employee_Hashcode e4 = new Employee_Hashcode("Raja", "ratlam");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		
	}

}
