package LeetCode;

import java.util.Iterator;

public class RemoveDuplicates {
	static int removeDuplicates(int nums[]) {
		if (nums.length == 0) {
			return 0;
		}
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
		}

		return j + 1;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		int[] nums1 = { 1, 1, 2 };
		int k1 = removeDuplicates(nums1);
		System.out.println("Output: " + k1); // Should print 2
		for (int i = 0; i < k1; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();

		int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int k2 = removeDuplicates(nums2);
		System.out.println("Output: " + k2); // Should print 5
		for (int i = 0; i < k2; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
	}
}
