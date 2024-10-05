package DSA.Sorting_Algorithms;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		int []arr= {4,1,2,3};//1234
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));	}

	private static void bubbleSort(int[] arr) {
		boolean isSwapped;
		for (int i = 0; i < arr.length; i++) {
			isSwapped=false;
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				isSwapped=true;
			}
			if(!isSwapped) {
				System.out.println("breaked");
				break;
			}
		}
		
		
	}

}
