package in.co.Exercise9_7;

public class Q1_Circle extends Q1_Shape {


	
	private int radius;
	public static final double PI =3.14;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		
		double area = PI* getRadius() * getRadius();
		
		return area;
	}
	
	
	

}
