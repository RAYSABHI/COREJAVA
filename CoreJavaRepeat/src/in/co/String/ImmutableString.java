package in.co.String;

public final class ImmutableString {
	
	private final int length;
	private final int width;
	
	public ImmutableString(int length,int width) {
		this.length = length;
		this.width = width;
		}
	
	public int getLength() {
		return length;
		}
	public int getWidth() {
		return width;
	}

	public float area() {
		float area = getLength()*getWidth();
		return area;
	}
}
