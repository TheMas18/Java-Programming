package Basic;

public class Factorial {
	public static void main(String[] args) {
		int n=1;
		int fact=1;
		while(n<=5) {
			fact*=n;
			n++;
		}
		System.out.println("Factorial:"+fact);
		System.out.println(factorial(5));
	}
	
	public static int factorial(int n) {
		if(n==1) {
			return n;
		}
		
		return n*factorial(n-1);
	}
}
