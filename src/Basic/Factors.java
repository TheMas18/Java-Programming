package Basic;

import java.util.ArrayList;

public class Factors {
	public static void main(String[] args) {
		//Find factors of given number
		int n=20;
//		findFactors1(n);
		//More optimized solution
//		findFactors2(n);
		//now lets print it in ascending order
		findFactors3(n);
	}
	//Find factors of given number
	private static void findFactors1(int n) {
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	//More optimized solution
	private static void findFactors2(int n) {
		for(int i=1; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.print(i+" ");
				}else {
					System.out.print(i+ " "+n/i +" ");
				}
			}
		}
	}
	//now lets print it in ascending order
	
	private static void findFactors3(int n) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=1; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.print(i+" ");
				}else {
					System.out.print(i+ " ");
					list.add(n/i);
				}
			}
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i) +" ");
		}
	}

}
