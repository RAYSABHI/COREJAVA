package in.co.gettersetter;

public class TestTriangle {
	public static void main(String[] args) {
		
		Triangle tr = new Triangle();
	
		tr.setBase(15);
		tr.setHight(20);
		tr.area();
		double area1 = tr.area();
		
		System.out.println(tr.getBase());
		System.out.println(tr.getHeight());
		System.out.println(area1);
		
	}

}
