
public class DynamicMethodDispatch {
	
	
	public static void main(String[] args) {
		
		//Here the reference is of class AA but the object is of class BB.
		// So the reference of class AA and object of class BB is linked in runtime.
		// since the object is assigned at runtime so which show it will call will also decided at runtime.
		//This is called runtime polymorphism. 
		// So every time changing the object will call different method and this concept is called
		//Dynamic Method Dispatch. To Achieve the Dynamic Method Dispatch we have to follow the concept 
		// runtime polymorphism.
		
		AA objAA = new BB();
		objAA.show();//In BB
		objAA = new CC();
		objAA.show();//In show
	}

}


class AA{
	public void show() {
		System.out.println("In AA");
	}
}

class BB extends AA{
	
	public void show() {
		System.out.println("In BB");
	}
}

class CC extends AA{
	public void show() {
		System.out.println("In CC");
	}
}