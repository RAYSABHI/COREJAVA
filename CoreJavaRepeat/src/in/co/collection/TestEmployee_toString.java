package in.co.collection;

public class TestEmployee_toString {
	public static void main(String[] args) {
		
		Employee_toString e1 = new Employee_toString("lakhan", "indore");
		Employee_toString e2 = new Employee_toString("lakhan", "indore");
		Employee_toString e3 = new Employee_toString("ram", "gwalior");
		Employee_toString e4 = new Employee_toString("mohit", "ujjain");
		Employee_toString e5 = new Employee_toString("aashish", "dewas");
		
		System.out.println(e1);
		System.out.println(e1.equals(e2));
		
		
		
	}

}
