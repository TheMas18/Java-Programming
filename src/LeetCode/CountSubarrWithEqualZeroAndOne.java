package LeetCode;

import java.util.HashMap;

public class CountSubarrWithEqualZeroAndOne {
	public static int countSubarrWithEqualZeroAndOne(int[] arr, int n) {
		// HashMap to store the prefix sums and their frequencies
		HashMap<Integer, Integer> sumCount = new HashMap<>();
		int prefix_sum = 0;
		int count = 0;

		// Initialize with prefix_sum 0 having one count

		for (int i = 0; i < n; i++) {
			// Convert 0 to -1 to simplify the problem
			prefix_sum += (arr[i] == 0) ? -1 : 1;

			// If prefix_sum has been seen before, add its count to result
			if (sumCount.containsKey(prefix_sum)) {
				count += sumCount.get(prefix_sum);
			}

			// Update the count of prefix_sum in the map
			sumCount.put(prefix_sum, sumCount.getOrDefault(prefix_sum, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 0, 0, 1, 0, 1, 1 };
		int n1 = arr1.length;
		System.out.println(countSubarrWithEqualZeroAndOne(arr1, n1)); // Output: 8

//	        int[] arr2 = {1, 1, 1, 1, 0};
//	        int n2 = arr2.length;
//	        System.out.println(countSubarrWithEqualZeroAndOne(arr2, n2)); // Output: 1
	}
}
