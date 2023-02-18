package in.co.learning;

public class Array {
public static void main(String[] args) {
	
	// int [] arr = new int [4];
	
	// first way
	/*arr [0] = 1;
	arr [1] = 2;
	arr [2] = 3;
	arr [3] = 4;
	
	// second way
	int [] arr1 = {1,2,3,4};
	
	int element = arr[1];
	System.out.println("element at first index : " +element);
	
	int size = arr.length;
	System.out.println("size of defined array : "+ size);
	*/

	
	
	// Question 2
	
	char [] sclname = {'i','p','s'};
	
	//for (int i=0; i<sclname.length; i++) {
		//System.out.println("Name ofschool :" + sclname[i]);
		//}
	System.out.println(sclname.length);
	System.out.println(sclname[2]);
	
	char [] copy = new char [2];
	System.arraycopy(sclname, 1,copy,0,2);
	System.out.println(copy);
	
}

}
