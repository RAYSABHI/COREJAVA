package in.co.Constructor;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	// parameterized constructor
	
	public Shape (String color, int borderwidth) {
		this.color = color;
		this.borderWidth = borderwidth;
	}
	
	// default Constructor
	
	public Shape () {
		super();
	}
	
	// getter method
	
	public String getcolor () {
		return color;
	}
	
	public int getborderWidth() {
		return borderWidth;
	}
	
	}
