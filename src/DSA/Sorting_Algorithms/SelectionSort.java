package DSA.Sorting_Algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 4, 5, 2 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}

	static void swap(int[] arr, int first, int last) {
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;

	}

	static int getMaxIndex(int[] arr, int start, int last) {
		int max = start;
		for (int j = start; j <= last; j++) {
			if (arr[max] < arr[j]) {
				max = j;
			}
		}
		return max;
	}
}
