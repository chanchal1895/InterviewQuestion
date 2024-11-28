
public class FirstRepeatedChar {
	public static void main(String[] args) {
		String str = "Chanchal";
		String sb ="";
		for(int i= 0;i< str.length();i++) {
			if(sb.contains(str.substring(i,i+1).toLowerCase())) {				
				System.out.println(str.substring(i,i+1));
				break;
			}else {
				sb=sb+str.substring(i,i+1).toLowerCase();
			}
		}
	}
	

}
