package in.co.Abstract;

public abstract class ShapeAbstract {
	
	private int a;
	private int b;
	
	public abstract double area(); // no body means abstract

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
}
