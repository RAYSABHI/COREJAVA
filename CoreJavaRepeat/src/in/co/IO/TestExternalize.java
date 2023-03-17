package in.co.IO;

public class TestExternalize {
	
	public static void main(String[] args) {
		
		
		Externalize e = new Externalize();
		
		e.name ="rays";
		e.maths=90;
		e.chemistry=75;
		e.physics=85;
		e.total=e.maths+e.chemistry;
		
	System.out.println(e.name);
	System.out.println(e.chemistry);
		System.out.println(e.total);
		
	}

}
