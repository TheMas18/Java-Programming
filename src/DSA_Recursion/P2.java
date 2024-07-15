package DSA_Recursion;

import java.util.ArrayList;
import java.util.List;

public class P2 {

//Q1 Check if array is sorted or not

//	public static void main(String[] args) {
//		int a[] = { 1, 4, 2, 3 };
//		if (checkIfSorted(a, 0)) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
//	}
//
//	static boolean checkIfSorted(int a[], int ptr) {
//		if (ptr == a.length - 1) {
//			return true;
//		}
//		return a[ptr] < a[ptr + 1] && checkIfSorted(a, ptr + 1);
//	}

//Q2 Linear Search

	// Method 1
//	public static void main(String[] args) {
//		int[] arr = { 1, 4, 5, 18, 2, 3, 12 };
//		System.out.println(linearSearch(arr, 18));
//	}
//
//	static int linearSearch(int a[], int target) {
//		return helperFun(a, 0, target);
//	}
//
//	static int helperFun(int a[], int i, int target) {
//		if (a[i] == target) {
//			return i;
//		}
//		return helperFun(a, i + 1, target);
//	}

	// Method 2
//	public static void main(String[] args) {
//		int[] arr = { 1, 18, 4, 5, 18, 2, 18, 3, 12 };
//		int target = 18;
//		System.out.println("Given Element " + target + " Exists : " + linearSearch(arr, target, 0));
//		System.out.println("First Index : " + firstIndex(arr, 0, 18));
//		System.out.println("Last Index : " + lastIndex(arr, arr.length - 1, 18));
//	
	// Printing all index Method 1
//		findAllIndex(arr, 0,target );
//		System.out.println(list);

	// Printing all index Method 2
	// System.out.println(findAllIndex(arr,0,target,new ArrayList<Integer>()));
	// }

//	static boolean linearSearch(int arr[], int target, int index) {
//		if (arr[index] == target) {
//			return true;
//		}
//		return arr[index] == target || linearSearch(arr, target, index + 1);
//	}
//
//	static int firstIndex(int a[], int i, int target) {
//		if (a[i] == target) {
//			return i;
//		}
//		return firstIndex(a, i + 1, target);
//	}
//
//	static int lastIndex(int a[], int i, int target) {
//		if (i == -1) {
//			return -1;
//		}
//		if (a[i] == target) {
//			return i;
//		} else {
//
//			return lastIndex(a, i - 1, target);
//		}
//	}

	// what if we want to add all the indexes
	// Method 1
//	static ArrayList<Integer> list =new ArrayList<Integer>();
//	static void findAllIndex(int a[], int i, int target) {
//		if(i==a.length) {
//			return;
//		}
//		if (a[i] == target) {
//			list.add(i);
//		}
//		findAllIndex(a, i + 1, target);
//	}
//	static List<Integer> findAllIndex(int a[], int i, int target, ArrayList<Integer> list) {
//		if (i == a.length) {
//			return list;
//		}
//		if (a[i] == target) {
//			list.add(i);
//		}
//		return findAllIndex(a, i + 1, target, list);
//	}

	// What if we dont want list in argument
//	public static void main(String[] args) {
//		int[] arr = { 1, 18, 4, 5, 18, 2, 18, 3, 12 };
//		int target = 18;
//		System.out.println(findAllIndex(arr, 0, target));
//	}
//
//	static ArrayList<Integer> findAllIndex(int a[], int i, int target) {
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		if (i == a.length) {
//			return list;
//		}
//		if (a[i] == target) {
//			list.add(i);
//		}
//		 ArrayList<Integer> ansFromBelowCalls = findAllIndex(a, i + 1, target);
//		 list.addAll(ansFromBelowCalls);
//		 return list;
//	}
	
//Rotated binary search
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,1,2};
		System.out.println(search(arr,6,0,arr.length-1));
	}
	static int search(int []arr,int target,int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start/2);
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[start] <=arr[mid]) {
			if(target>=arr[start] && target<=arr[mid]) {
				return search(arr, target, start, mid-1);
			}
			else {
				return search(arr, target,mid+1, end);
			}
		}
		if(target>=arr[mid] && target<=arr[end]) {
			return search(arr, target,mid+1, end);
		}
		return search(arr, target, start, mid-1);
	}
}
