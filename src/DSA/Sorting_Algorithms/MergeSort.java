package DSA.Sorting_Algorithms;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 3, 1, 2 };
		int a[]=mergeSort(arr);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] mergeSort(int arr[]) {
		if(arr.length==1) {
			return arr;
		}
		
		int mid=arr.length/2;
		
		int []left =mergeSort(Arrays.copyOfRange(arr,0, mid));
		int []right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
		
		return merge(left,right);
	}
	
	public static int[] merge(int first[], int second[] ) {
		
		int merge[]=new int[first.length + second.length];
		int i=0; // ptr for first array
		int j=0; // ptr for second array
		int k=0; // ptr for merge array
		
		while(i< first.length && j<second.length) {
			if(first[i]<second[j]) {
				merge[k]=first[i];
				i++;
			}else {
				merge[k]=second[j];
				j++;
			}
			k++;
		}
		
		while(i< first.length) {
			merge[k++]=first[i++];
		}
		while(j< second.length) {
			merge[k++]=second[j++];
		}
		return merge;
	}
}
