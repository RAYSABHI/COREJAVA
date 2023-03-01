package in.co.Exercise9_7;

public class Q1_Triangle extends Q1_Shape {
	
	
	private int base;
	private int height;

	
	//getter setter 
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHight(int height) {
		this.height = height;
	}
	
	
	@Override
	public double area() {
		double area = (0.5 * getBase() * getHeight());
		
		return area;
	}

}
