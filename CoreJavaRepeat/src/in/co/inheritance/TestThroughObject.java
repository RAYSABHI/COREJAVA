package in.co.inheritance;

public class TestThroughObject {
	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		Rectangle r = (Rectangle) s;
		Shape s1 = new Circle();
		Circle c = (Circle) s1;
		
		
		// rectanle class
		r.setLength(12);
		r.setWidth(12);
		r.setColor("yellow");
		System.out.println(r.getColor());
		
		// circle class
		
		  c.setRadius(15);
		  c.area(); 
		  c.setColor("red");
		  System.out.println(c.getColor());
		  System.out.println(c.getRadius());
			}

		}
