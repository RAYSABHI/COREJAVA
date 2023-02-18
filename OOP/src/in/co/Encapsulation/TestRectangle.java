package in.co.Encapsulation;

public class TestRectangle {
	public static void main(String[] args) {
		
		Rectangle rctl = new Rectangle ();
		
		//int lnth = rctl.getLength2();
		//int bdth = rctl.getBreadth2();
		
		rctl.setLength2(20);
		rctl.setBreadth2(30);
		
		int Length = rctl.getLength2();
		System.out.println("Length : " +Length);
		
		int Breadth = rctl.getBreadth2();
		System.out.println("Breadth : " +Breadth);
		
		int Area = Length * Breadth;
		System.out.println("area : "+ Area);
		
		//update new value through setter
		rctl.setLength2(50); 
		  rctl.setBreadth2(60); 
		  
		  // getter method for value update
		  int new_length = rctl.getLength2();
		  int new_breadth = rctl.getBreadth2();
		  
		  int newArea = new_length*new_breadth;
		  System.out.println("new area : "+ newArea);
	}

}
