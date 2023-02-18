package in.co.gettersetter;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s = new Shape();
		
		s.setColor("Blue");
		s.setBorderWidth(15);
		
		String clr = s.getColor();
		int BW = s.getBorderWidth();
		
	
		
		System.out.println("Color is blue :" + clr);
		System.out.println("borderwidth is :" + BW);
	}

}
