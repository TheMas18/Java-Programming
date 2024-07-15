package TestHere;

import java.util.*;

public class Practice {
	public static void main(String[] args) {
//		int a[] = { 6,4,5,2,1,3 };
//		int count=0;
//		
//		Set<Integer> h=new HashSet();
//		for(int i=0;i<a.length;i++) {
//			h.clear();
//			for(int j=i+1;j<a.length;j++) {
//				int third=10-(a[i]+a[j]);
//				
//				if(h.contains(third)) {
//					count++;
//					System.out.println(a[i] +" "+a[j]+" "+third);
//				}
//				h.add(a[j]);
//			}
//		}
//		int a[] = { 6,4,5,2,1,3 };
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				for (int k = j+1; k < a.length; k++) {
//					if(a[i]+a[j]+a[k]==10) {
//						System.out.println(a[i] +" "+a[j]+" "+a[k]);
//					}
//				}
//			}
//		}

//		int[][] a = new int[3][3];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[j][i]);
//			}
//			System.out.println();
//		}
//		int a[] = { 10, -17, -28, -35, -73, 2, -110, 3, 5, -240 };
//		int large = a[0];
//		int second_large = 0;
//		int third_large = 0;
//		
//		for (int i = 0; i < a.length; i++) {
//			if (a[i]>large) {
//				
//				third_large=second_large;
//				second_large=large;
//				large=a[i];
//			} else if(a[i]>second_large && a[i]!=large)
//			{
//				third_large=second_large;
//				second_large=a[i];
//			}
//			
//			else if(a[i]>third_large && a[i]!=second_large)
//			{
//				third_large=a[i];
//			}
//		}
//		System.out.println(large);
//		System.out.println(second_large);
//		System.out.println(third_large);
//		
//		int a[] = { 10, -17, -28, -35, -73, 2, -110, 3, 5, -240 };
//		int small = a[0];
//		int second_small = 0;
//		int third_small = 0;
//		
//		for (int i = 0; i < a.length; i++) {
//			if (a[i]<small) {
//				third_small=second_small;
//				second_small=small;
//				small=a[i];
//			
//			} else if(a[i]<second_small && a[i]!=small)
//			{
//				third_small=second_small;
//				second_small=a[i];
//			}
//			
//			else if(a[i]<third_small && a[i]!=second_small)
//			{
//				third_small=a[i];
//			}
//		}
//		System.out.println(small);
//		System.out.println(second_small);
//		System.out.println(third_small);

//		int a[] = { 1, 2, 3, 4, 5, 6, 8 };
//		Arrays.sort(a);
//		int li = a[0];
//		int hi = a[a.length - 1];
//		int search = 8;
//
//		while (li < hi) {
//			int mi = (li + hi) / 2;
//			if (a[mi] == search) {
//				System.out.println("Element found at " + mi + " is " + a[mi]);
//				break;
//			} else if (search > a[mi]) {
//				li = li + mi;
//			} else {
//				hi = hi - mi;
//			}
//
//		}

		/*
		 * int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
		 * 14, 15, 16 } };
		 * 
		 * int rows = matrix.length;// 4 int cols = matrix[0].length;// 4
		 * 
		 * int top = 0, // 0 1 bottom = rows - 1, left = 0, right = cols - 1;// 3 2
		 * 
		 * while (top <= bottom && left <= right) { // top for (int i = left; i <=
		 * right; i++) { System.out.print(matrix[top][i]); } top++;// 1 // right for
		 * (int i = top; i <= bottom; i++) { System.out.print(matrix[i][right]); }
		 * right--;
		 * 
		 * // bottom if (top <= bottom) { for (int i = right; i >= left; i--) {
		 * System.out.print(matrix[bottom][i]); } bottom--; } // left if (left <= right)
		 * { for (int i = bottom; i >= top; i--) { System.out.print(matrix[i][left]); }
		 * left++; }
		 * 
		 * }
		 */

		
	}
}
