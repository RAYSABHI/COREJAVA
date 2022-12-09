
package in.co.Encapsulation;

public class TestEncapsulationEX {
	public static void main(String[] args) {
		
		EncapsulationEX en = new EncapsulationEX(); //  making object
		
		en.setFname("Ram");
		en.setLname("xyz");
		en.setId(1);
		
		String fname =en.getFname();
		System.out.println(fname);
		
		String lname = en.getLname();
		System.out.println(lname);
		
		int id = en.getId();
		System.out.println(id);
		
		
	}

}
