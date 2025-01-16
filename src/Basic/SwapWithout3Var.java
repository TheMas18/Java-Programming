package Basic;

public class SwapWithout3Var {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
//		b=b-a;
//		a=a+b;
//		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
