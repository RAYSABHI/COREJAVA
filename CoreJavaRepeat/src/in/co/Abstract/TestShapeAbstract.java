package in.co.Abstract;

public class TestShapeAbstract {
	public static void main(String[] args) {
		
		ChildShapeAbstract c = new ChildShapeAbstract();
		
		c.setA(10);
		c.setB(10);
		c.area();
		
		System.out.println(c.getA() + c.getB());
		System.out.println(c.area());
		
		
	}

}
