package ConstructorConcept;
//Note ----Inheritance and overriding is not applicable in constructor.
public class ConstructorOverloading {
	
public static void main(String[] args) {
	Test t1 = new Test(10.5);
	System.out.println("---------------");
	Test t2 = new Test(10);
	System.out.println("---------------");
	Test t3 = new Test();
	
}
}
class Test{
	public Test(double d) {
		this(10);
		System.out.println("in double Constructor");
		
		
	}
	public Test(int d) {
		this();
		System.out.println("in int Constructor");
		
	}
	public Test() {
		System.out.println("in no args constructor");
	}
}
