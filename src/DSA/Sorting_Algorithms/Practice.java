package DSA.Sorting_Algorithms;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 3 };// 1234
//		bubbleSort(arr);
//		cycleSort(arr);
//		int a[] = mergeSort(arr);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(arr));

//		mergeSortInPlace(arr, 0, arr.length);
//		System.out.println(Arrays.toString(arr));
		
//		quickSort(arr,0,arr.length-1);
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int maxIndex=getMaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
		}
		
	}

	private static int getMaxIndex(int[] arr, int start, int end) {
		int max=start;
		for(int i=start;i<end;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}

	private static void quickSort(int[] arr, int low, int hi) {
		if(low>=hi) {
			return;
		}
		int s=low;
		int e=hi;
		
		int mid=s+(e-s)/2;
		int pivot=arr[mid];
		
		while(s<=e) {
			
			while(arr[s]<pivot) {
				s++;
			}
			while(arr[e]>pivot) {
				e--;
			}
			
			if(s<=e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
			
		}
		
		quickSort(arr,low,e);
		quickSort(arr,s,hi);
		
	}

	private static void mergeSortInPlace(int[] arr, int s, int e) {
		if (e - s == 1) {
			return;
		}
		int mid = (s + e) / 2;
		mergeSortInPlace(arr, s, mid);
		mergeSortInPlace(arr, mid, e);

		mergeInplace(arr, s, mid, e);

	}

	private static void mergeInplace(int[] arr, int s, int mid, int e) {
		int[] merge = new int[e - s];
		int i = s;
		int j = mid;
		int k = 0;

		while (i < mid && j < e) {
			if (arr[i] < arr[j]) {
				merge[k] = arr[i];
				i++;
			} else {
				merge[k] = arr[j];
				j++;
			}
			k++;
		}

		while (i < mid) {
			merge[k++] = arr[i++];
		}
		while (j < e) {
			merge[k++] = arr[j++];
		}

		for (int l = 0; l < merge.length; l++) {
			arr[s + l] = merge[l];
		}

	}

	private static int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int mid = arr.length / 2;
		int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return mergeArray(left, right);
	}

	private static int[] mergeArray(int[] left, int[] right) {
		int[] temp = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				temp[k] = left[i];
				i++;
			} else {
				temp[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < left.length) {
			temp[k++] = left[i++];
		}
		while (j < right.length) {
			temp[k++] = right[j++];
		}
		return temp;
	}

	private static void cycleSort(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int correctIndex = arr[i] - 1;
			if (arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}

	}

	private static void bubbleSort(int[] arr) {
		boolean isSwapped;
		for (int i = 0; i < arr.length; i++) {
			isSwapped = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
				isSwapped = true;
			}
			if (!isSwapped) {
				System.out.println("breaked");
				break;
			}
		}
	}

	public static void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
