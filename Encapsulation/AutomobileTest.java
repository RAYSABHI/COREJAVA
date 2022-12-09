package in.co.Encapsulation;

public class AutomobileTest {
public static void main(String[] args) {
	
	Automobile am = new Automobile();
	
	am.setcolour("blue");
	am.setgear(6);
	am.setmake("audi");
	am.setspeed(120);
	
	String colour = am.getcolour();
	System.out.println(colour);
	
	int gear = am.getgear();
	System.out.println(gear);
	
	String make = am.getmake();
	System.out.println(make);
	
	int speed = am.getspeed();
	System.out.println(speed);
	
}
}
