package ConstructorConcept;

public class ConstructorRecursion {

	public static void m1() {
		m2();
	}

	private static void m2() {// recursive call for a method will give run time error.StackOverFlow exception
		m1();
	}

	public ConstructorRecursion(int i) {
		this();
	}

	public ConstructorRecursion() {
		// this(10);//compilation error --Recursive constructor invocation
		// ConstructorRecursion
	}

	public static void main(String[] args) {

	}

}
