
public class MakeTwoStringIdentical {
	public static void main(String[] args) {
		String str1 = "tnk";
		String str2 = "tanK";
		int maxLength =Math.max(str1.length(), str2.length());
		int minlen = Math.min(str1.length(), str2.length());
		
		
		int count = maxLength-minlen;
		System.out.println(maxLength);
		System.out.println(minlen);
		
		for(int i =0;i<minlen;i++) {
		}
		System.out.println(count);
		
	}

}
