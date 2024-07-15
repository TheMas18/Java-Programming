package LeetCode;

import java.util.Arrays;

public class RemoveDuplicates_Medium {
	public static void main(String[] args) {
//		int[] nums1 = { 1, 1, 1, 2, 2, 3 };
//		int k1 = removeDuplicates(nums1);
//		System.out.println("Output: " + k1); // Output: 5
//		System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums1, k1))); // [1, 1, 2, 2, 3]

		int[] nums2 = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		int k2 = removeDuplicates(nums2);
		System.out.println("Output: " + k2); // Output: 7
		System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums2, k2))); // [0, 0, 1, 1, 2, 3, 3]

	}

	private static int removeDuplicates(int[] nums) {
		if (nums.length <= 2) {
			return nums.length;
		}
		int j = 2;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] != nums[j - 2]) {
				nums[j] = nums[i];
				j++;
			}
		}

		return j;
	}
}
