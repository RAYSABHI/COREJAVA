package in.co.constructor;

public class TestRectangleCons {
	public static void main(String[] args) {
		
	
	RectangleCons r1 = new RectangleCons();
	RectangleCons r = new RectangleCons(10,15);
	
	System.out.println("length of rectangle: " + r.getlength());
	System.out.println("width of rectangle: " + r.getwidth());
	System.out.println("area of rectangle: "+ r.area());
	}
}
