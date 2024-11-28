package Recursion;

public class RecursionEx1 {	
	public static void main(String[] args) {
		print(5);	
		System.out.println();
		print1(1);
		System.out.println();
		System.out.println(SumOfNautralNum(10));
		System.out.println(printFactorial(5));
		printFibonacci(0, 1, 5);
		System.out.println();
		System.out.println(prinfXPowerN(2, 5));
	}
	public static  void print(int n) {
		if(n<1) {
			return;
		}
		System.out.print(n+" ");				
		print(n-1);
	}
	public static void print1(int n) {
		
		if(n==6) {
			return;
		}
		System.out.print(n+" ");
		print1(n+1);
	}
	public static int SumOfNautralNum(int n) {
		if(n==0) {
			return 0;
		}
		int sum = n+ SumOfNautralNum(n-1);
		return sum;
		
	}
	public static long printFactorial(int n) {
		if(n==1) {
			return 1;
		}
		long fact = n*printFactorial(n-1);
		return fact;
	}
	public static void printFibonacci(int a, int b,int n) {
		if(n<=0) {
			return;
		}
		if(a==0 && b==1) {
			System.out.print(a+" "+b+" "+(a+b)+" ");
				a=b;
				b=b+a;
		}
		System.out.print(b+" ");
		int c = a+b;
		a=b	;		
		printFibonacci(b, c, n-1);			
	}
	public static long prinfXPowerN(int x, int n){
		if(x==0) {
			return 0;
		}if(n==0) {
			return 1;
		}
		long value = prinfXPowerN(x, n-1);
		value = x*value;
		return value;
	}
}
