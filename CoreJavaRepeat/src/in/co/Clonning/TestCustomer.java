package in.co.Clonning;

public class TestCustomer {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1 = new Customer("ram");
		
		//clone the customer and change values
		Customer c2  = (Customer)c1.clone();
		c2.name	= "Balram";
		c2.account.balance=20;
		
		System.out.println("original object");
		System.out.println("name : "+c1.name);
		System.out.println("balance : "+c1.account.balance);
		
		System.out.println("cloned object");
		System.out.println("name : "+c2.name);
		System.out.println("balance : "+c2.account.balance);
	}

}
