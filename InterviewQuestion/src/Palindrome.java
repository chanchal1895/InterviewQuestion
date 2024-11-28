
public class Palindrome {
	public static void main(String[] args) {
		String str = "MaM";
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		if(sb.toString().equals(str)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(sb+" is not palindrome");
		}
	}
}
