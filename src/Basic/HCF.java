package Basic;

import java.util.Arrays;

public class HCF {
	public static void main(String[] args) {

		System.out.println(findHCF(3,7));
		int []digits= {1,2,3};
		System.out.println(Arrays.toString(plusOne(digits)));
	}

	private static int  findHCF(int a, int b) {
		return a*b/findGCD(a,b);
	}

	private static int findGCD(int a, int b) {
		if (a == 0) {
			return b;
		}
		return findGCD(b % a, a);
	}
	
	 public  static int[] plusOne(int[] digits) {
	        int digit=0;
	        for(int i:digits){
	            digit=digit*10+i;
	        }
	        digit++;
	        int flag=digit;
	        System.out.println(digit);
	        int count=0;
	        while(digit!=0){
	            count++;
	            digit/=10;
	        }
	        int result[]=new int[count];
	        System.out.println(count);
	        for(int i=0;i<result.length;i++) {
	        	int f=flag%10;
	        	 System.out.println(f);
	        	result[i]=f;
	        	flag/=10;
	        }
	        return result;
	    }
}
