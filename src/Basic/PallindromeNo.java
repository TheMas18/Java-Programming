package Basic;

public class PallindromeNo {
	public static void main(String[] args) {
		int n=121;
		int temp=n;
		int rev=0;
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println(temp+" is Pallindrome no");
		}
	}

}
