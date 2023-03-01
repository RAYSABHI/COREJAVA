package in.co.Exercise9_7;

public class Q1_Rectangle extends Q1_Shape {
	
	private int length;
	private int width;
	
	// getter setter
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double area() {
		double area = getLength() * getWidth();
		
		return area;
	}
	
	

	
	
	

}



