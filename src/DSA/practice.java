package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
	static public void main(String[] aa) {
		int []a= {3,5,3,1,3,5,4};
		int totalSum=0;
		for (int i = 0; i < a.length; i++) {
			totalSum=totalSum+a[i];
		}
		int [][]r=divide(a,totalSum);
		for (int i = 0; i < r.length; i++) {
			for(int j=0;j<r[i].length;j++) {
				System.out.print(r[i][j]);
			}
			System.out.println();
		}
		
	}
	static int[][] divide(int []a,int total){
		 int[] temp1 = new int[a.length];
	        int[] temp2 = new int[a.length];
	        int s1 = 0, s2 = 0;
	        int count1 = 0, count2 = 0;

	        for (int i = 0; i < a.length; i++) {
	            s1 += a[i];
	            temp1[count1++] = a[i];
	            if (s1 >= total / 2) {
	                break;
	            }
	        }

	        for (int i = count1; i < a.length; i++) {
	            temp2[count2++] = a[i];
	        }

	        // Resize the arrays to the correct length
	        int[] part1 = new int[count1];
	        int[] part2 = new int[count2];
	        System.arraycopy(temp1, 0, part1, 0, count1);
	        System.arraycopy(temp2, 0, part2, 0, count2);

	        return new int[][]{part1, part2};
	    }
	

}
