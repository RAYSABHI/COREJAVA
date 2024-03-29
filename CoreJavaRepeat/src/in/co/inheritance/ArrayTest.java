package in.co.inheritance;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		double sum = 0.0;
		Shape s1[] = new Shape[3];
		
		// here s1[0] means at 0 index allot to rectangle
		s1[0] = new Rectangle();
		Rectangle r = (Rectangle) s1[0];
		r.setLength(10);
		r.setWidth(10);
		r.area();
	
		System.out.println("area of rectangle : " +r.area());
		
		// here s1[1] allot to circle
		s1[1] = new Circle();
		Circle c = (Circle)s1[1];
		c.setRadius(10);
		c.area();
		
		System.out.println("area of circle : "+ c.area());
		
		s1[2] = new Triangle();
		Triangle tr = (Triangle) s1[2];
		tr.setBase(10);
		tr.setHight(15);
		tr.area();
		
		System.out.println("area of triangle : " + tr.area());
		
		for (int i= 0; i<s1.length; i++) {
			sum = sum + s1[i].area();
			}
		
		// sum = r.area()+ c.area() + tr.area();
			 System.out.println("Sum of all the area : " +sum);
	
	}

}
