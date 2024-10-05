package DSA;

public class RotatedBinarySearch {

	// Using Recursion
	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 8, 1, 2 };
		int target = 60;
		int start = 0;
		int end = arr.length - 1;
		System.out.println(rotatedBSRecursion(arr, target, start, end));
	}

	private static int rotatedBSRecursion(int[] arr, int target, int start, int end) {
		if (start > end) {
			return -1;

		}
		int mid = start + (end - start) / 2;
		if (arr[mid] == target) {
			return mid;
		}

		if (arr[start] <= arr[mid]) {
			if (target >= arr[start] && target <= arr[mid]) {
				return rotatedBSRecursion(arr, target, start, mid - 1);
			} else {
				return rotatedBSRecursion(arr, target, mid + 1, end);
			}
		}

		if (target >= arr[mid] && target <= arr[end]) {
			return rotatedBSRecursion(arr, target, mid + 1, end);
		}
		return rotatedBSRecursion(arr, target, start, mid - 1);

	}
}
