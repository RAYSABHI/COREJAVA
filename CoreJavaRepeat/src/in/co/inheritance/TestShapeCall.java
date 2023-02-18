package in.co.inheritance;

public class TestShapeCall {
	
	public static void main(String[] args) {
	
		Rectangle rec = new Rectangle();
		Circle c = new Circle();
		Triangle T = new Triangle();
		
		// for rectangle class
		rec.setColor("white");
		rec.setBorderWidth(25);
		rec.setLength(40);
		rec.setBorderWidth(40);
		double a= rec.area();
				
		System.out.println((rec.getColor() ) + " " + ( rec.getBorderWidth()));
		System.out.println(a);
	
		
		//for circle class
		
		c.area();
		c.setRadius(15);
		c.setColor("yellow");
		 System.out.println(c.area());
	}
	

}
