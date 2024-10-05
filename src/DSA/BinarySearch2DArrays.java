package DSA;

import java.util.Arrays;

public class BinarySearch2DArrays {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 45 }, 
						{ 14, 22, 34, 50 }, 
						{ 16, 28, 36, 54 }, 
						{ 20, 31, 37, 60 } 
					  };
		
		int target =-1;
		int []result = binarySearch2D(arr,target);
		System.out.println(Arrays.toString(result));
		
	}
	
	static int[] binarySearch2D(int arr[][], int target) {
		int row=0;
		int col=arr.length-1;
		
		while(row<arr.length && col>=0) {
			if(arr[row][col]==target) {
				return new int[] {row,col};
			}
			
			if(arr[row][col] >target) {
				col--;
			}
			else {
				row++;
			}
			
			
		}
		return new int[] {-1,-1};
		
		
	}
	
	
}
