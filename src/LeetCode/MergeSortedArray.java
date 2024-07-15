package LeetCode;

import java.util.Arrays;

// leet codee : https://leetcode.com/problems/merge-sorted-array/submissions/1275996621/?envType=study-plan-v2&envId=top-interview-150
public class MergeSortedArray {
	static void merge(int nums1[], int m, int nums2[], int n) {
		int p1 = m - 1;
		int p2 = n - 1;

		int p = m + n - 1;

		while (p1 >= 0 && p2 >= 0) {
			if (nums1[p1] > nums2[p2]) {
				nums1[p] = nums1[p1];
				p1--;
			} else {
				nums1[p] = nums2[p2];
				p2--;
			}
			p--;
		}

		while (p2 >= 0) {
			nums1[p] = nums2[p2];
			p2--;
			p--;
		}

	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]

		int[] nums3 = { 1 };
		int m2 = 1;
		int[] nums4 = {};
		int n2 = 0;
		merge(nums3, m2, nums4, n2);
		System.out.println(Arrays.toString(nums3)); // Output: [1]

		int[] nums5 = { 0 };
		int m3 = 0;
		int[] nums6 = { 1 };
		int n3 = 1;
		merge(nums5, m3, nums6, n3);
		System.out.println(Arrays.toString(nums5)); // Output: [1]
	}
}
