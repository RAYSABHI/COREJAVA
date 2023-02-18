package in.co.gettersetter;

public class Triangle {
	
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
	
	public double area () {
		double area = (0.5 * getBase() * getHeight());
		return area;
		
	}
	
	
	
	

}
