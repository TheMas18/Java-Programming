package DSA;

public class MathsInDSA {
	public static void main(String[] args) {
			
		//Find Square Root Of Number
		int n=8;
		int p=3; // precision
		System.out.println(sqrt(n,p));
	}

	private static double sqrt(int n, int p) {
		int s=0;
		int e=n;
		
		double root=0.0;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(mid*mid ==n) {
				return mid;
			}
			
			if(mid*mid>n) {
				e=mid-1;
			}else {
				s=mid+1;
			}
		}
		double incr=0.1;
		for(int i=0;i<p;i++) {
			while(root*root<=n) {
				root+=incr;
			}
			root-=incr;
			
		}
		
		
		
		return root;
		
	}
}
