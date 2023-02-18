package in.co.constructor;

public class TestCircleCons {
public static void main(String[] args) {
	
	CircleCons CS = new CircleCons(15);
	System.out.println(CS.getradius());
	
	double area1 = CS.area();
	System.out.println("area of circle radius 15 is : " + area1);
	
}

}
