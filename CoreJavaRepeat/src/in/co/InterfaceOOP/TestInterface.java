package in.co.InterfaceOOP;

public class TestInterface {
	public static void main(String[] args) {
		
		Businessman b = new Businessman();
		b.earnMoney();
		b.donation();
		b.party();
		b.helpToOthers();
		
		b.setName("Rays");
		b.setAddress("Indore");
		
		System.out.println(b.getName() + (" ")+ b.getAddress());

		
	
	
	}

}
