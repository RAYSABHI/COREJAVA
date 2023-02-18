package in.co.inheritance;

public class Circle extends Shape {
	
	private int radius;
	public static final double PI =3.14;
	
	// getter setter
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area () {
		double area = (PI) * getRadius() * getRadius();
		return area;
	}
	

	
	

}
