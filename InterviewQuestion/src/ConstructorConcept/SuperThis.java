package ConstructorConcept;


//Note--we can use public, protected, default, private access modifier with constructor
//Static, final, etc are not allowed with it.
public class SuperThis {

}

class Parent{
	int i;
	int j;
	public Parent(int i) {
		this();// this()---use to call current class constructor and only use as
			   // the first line of constructor.	
		this.i=10;//this----keyword use to access instance variable.
		this.j=20;
		
	}
	public Parent() {
	}
}
class Child extends Parent{
	int i;
	int j;
	Child(){
		super();// use to call super calss constructor
		super.i= i;// super keyword is used to access the instance variable of parent class.
	}
}