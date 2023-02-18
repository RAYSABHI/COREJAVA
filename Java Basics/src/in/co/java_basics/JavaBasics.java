package in.co.java_basics;

public class JavaBasics {
public static void main(String[] args) {
	
	// Print 01
	
	String name = "Abhishek Parsai";
			System.out.println(name);
			
	// 02 Operators
			
	int a = 45;
	int b = 55;
	int c = a+b;
	System.out.println("sum :"  +c);
	
	int i = 80;
	float j =70;
	float k= (float )i-j;
	System.out.println("minus : " + k);
	
	String A = "abhi";
	String P = " parsai";
	
	System.out.println(A +P);
	
	// 03 Type Casting
	// implicit
	
	int m = 45;
	float n = 55.5f;
	
	float mn = (m*n);
	System.out.println("multiplication of two numbers mn : " +mn);
	
	// explicit
	
	float o = 60.50f;
	int p = 50;
	int op = (int) (o*p);
    System.out.println("explicit result :" +op);	
    
    
    // 04 Pre- Increment
   
    int s = 20;
    int t = 30;
    System.out.println("before increment :" +s);
    System.out.println("after increment :"+ ++s);
    
    // Post increment
    int s1 = 20;
    int t1 = 30;
    System.out.println("before increment " + t1);
    System.out.println("incremented " + t1++);
    System.out.println(t1);
    
    // Multiple Assignment 
    // pre
    int i1 = 0;
    System.out.println(++i1 + ++i1 + ++i1 + ++i1 + ++i1);
    
    // post
    float r = 0.f;
    System.out.println(r++ + r++ + r++ + r++ + r++);
 
    // pre + post
    int w = 0;
    System.out.println(w++ + w++ + w++ + ++w + ++w + ++w);
    
    
    int d = 10;
    System.out.println(d++ + ++d + ++d + d++ + d++);
    
    // ternory operators or conditional
    
    int num = 20;
    int num2 = 30;
    int num3 = (num>num2)?num:num2;
    System.out.println(num3);
    
    // if else with logical operators AND OR
    
    int studentmarks = 75;
    
    if(studentmarks>=75 && studentmarks<=100) {
    System.out.println("Grade A");
    }
    else if (studentmarks>=55 && studentmarks<=75) {
    	System.out.println("Grade B");
    }
    else if (studentmarks>=35 && studentmarks<55) {
    	System.out.println("Grade C");
    }
    
    else if(studentmarks>25 && studentmarks<33) {
    	System.out.println("Grade D");
    }
    else {
    	System.out.println("you are failed");
   	    }
		}
		}