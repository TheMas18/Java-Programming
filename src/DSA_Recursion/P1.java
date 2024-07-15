package DSA_Recursion;

public class P1 {

//Q print 1-5 and pprint 5-1
//	public static void main(String[] args) {
//		fun(5);
//		funRev(5);
//	}
//	static void fun(int n) {
//		if(n==0) {
//			return;
//		}
//		fun(n-1);
//		System.out.println(n);
//	}
//	static void funRev(int n) {
//		if(n==0) {
//			return;
//		}
//		System.out.println(n);
//		funRev(n-1);
//	}

//Q2 Factorial of given number
//	public static void main(String[] args) {
//		System.out.println(fact(5));
//	}
//	static int fact(int n) {
//		if(n==1) {
//			return 1;
//		}
//		return n*fact(n-1);
//	}

//Q3 Sum of n numbers 
//
//	public static void main(String[] args) {
//		System.out.println(sum(5));
//	}
//
//	static int sum(int n) {
//		if (n <= 1) {
//			return 1;
//		}
//		return n + sum(n - 1);
//	}

//Q4 Sum of the digit (1342=1+3+4+2=10)

//	public static void main(String[] args) {
//		System.out.println(sum(1342));
//	}
//	static int sum(int n) {
//		if(n==0) {
//			return n;
//		}
//		return n%10 + sum(n/10);
//	}

//Q5 reverse a number 1342==>2431

//Method 1
	
//	static int sum=0;
//	public static void main(String[] args) {
//		rev(1342);
//		System.out.println(sum);
//	}
//	static void rev(int n) {
//		if(n==0) {
//			return ;
//		}
//		int rem=n%10;
//		sum=sum*10+rem;
//		rev(n/10);
//	}

//Method 2
//	public static void main(String[] args) {
//		System.out.println(rev(1234));
//	}
//	static int rev(int n) {
//		int digits=(int)(Math.log10(n))+1;//its calculating number of digits of given n. for ex : 1234 is 4
//		return helper(n,digits);
//	}
//	static int helper(int n,int digits) {
//		if(n%10==n) {
//			return n;
//		}
//		int rem=n%10;
//		return  rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
//	}
	
//Q6 count number of zeros
	public static void main(String[] args) {
		System.out.println(count(300532100));
	}
	static int count(int n) {
		return helper(n,0);
	}
	static int helper(int n, int c) {
		if(n==0) {
			return c;
		}
		int rem=n%10;
		if(rem==0) {
			return helper(n/10,c+1);
		}
		return helper(n/10,c);
	}
}
