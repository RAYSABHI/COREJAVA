package in.co.constructor;

public class ShapeConst {
	
	private String color = null;
	private int borderWidth =0;
	
	public ShapeConst() {
		System.out.println("this is default constructor");
		
	}
	
	public ShapeConst (String color, int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
		
	}
		public String getColor() {
			return color;
		}
		
		public int getBorderWidth() {
			return borderWidth;
		}
		
	}


