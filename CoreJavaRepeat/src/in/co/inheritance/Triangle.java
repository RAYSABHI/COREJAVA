package in.co.inheritance;

public class Triangle extends Shape {
	
	private int base;
	private int hight;

	
	//getter setter 
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public double area () {
		double area = (0.5 * getBase() * getHight());
		return area;
		
	}
	
	
	
	

}
