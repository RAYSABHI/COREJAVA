package in.co.constructor;

public class RectangleCons {
	
	private int length;
	private int width;
	
	public RectangleCons() {
		System.out.println("default of rectangle class");
	}

	public RectangleCons(int length, int width) {
		this.length = length;
		this.width = width;
		}
	
	public int getlength() {
		return length;
		
	}
	public int getwidth() {
		return width;
	}
	
	public double area() {
		double area = getlength() * getwidth();
		return area;
	}
	
}