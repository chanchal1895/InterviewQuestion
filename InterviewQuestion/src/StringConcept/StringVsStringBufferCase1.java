package StringConcept;

public class StringVsStringBufferCase1 {
	
	public static void main(String[] args) {
		String name = "Chanchal";
		name.concat("Kumar");// Since this newly created object is not assigned to any variable.
		                     //So it is available for garbage collection.  
		System.out.println(name);//Chanchal 
		StringBuffer sb =new StringBuffer("Chanchal");
		sb.append("Kumar");
		System.out.println(sb);
	}

}
