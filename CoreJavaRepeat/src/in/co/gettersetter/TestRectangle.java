package in.co.gettersetter;

public class TestRectangle {
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		rec.setLength(15);
		rec.setWidth(20);
		
		
		double area1 = rec.area();
		
		System.out.print(rec.getLength() + "*");
		System.out.print(rec.getWidth() + "=");
		System.out.println(area1);
	}

}
