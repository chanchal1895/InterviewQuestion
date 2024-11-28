//this & super keyword always talks about object, instance variable, object related variable.
//this & super keywords refer current class and super class instance members repectively.
//We can not use this & super in static context. Except static area we can use this & super anywhere.\
//super()---to call super class constructor.
//this()----to call current class constructor.
//we can use super() and this() only in constructor, as the first statement.
// we can use only one inside a constructor but not both simultaneously.
public class SuperAndThis {
public  void main(String[] args) {
	AAA a = new BBB();
	a.show();
}
}

class AAA{
	String s = "Parent variable";
	public void show() {
		System.out.println(this.s);
	}
	public AAA() {
		// TODO Auto-generated constructor stub
		this("Current class AAA constructor call");
		System.out.println("In AAA constructor");
	}
	public AAA(String s) {
		System.out.println("In AAA parameterised constructor");
	}
	public static void print() {
		System.out.println("I am static of AAA class");
	}
}

class BBB extends AAA{
	String s = "Child variable";
	
	
	public void show() {
		System.out.println(this.s);
		System.out.println(super.s);
	}
	public static void print() {
		
		//We can not use this & super in static context
		//System.out.println(this.s); ---compilation error
		//System.out.println(super.s);---compilation error
	}
	public BBB() {
		// TODO Auto-generated constructor stub
		this("Current class BBB constructor call");
		System.out.println("In BBB constructor");
	}
	public BBB(String s) {
		super("Super class parameterised constructor call");
		System.out.println("In BBB parameterised constructor");
	}
	
}