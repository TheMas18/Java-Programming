package LeetCode;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int k = removeElement(nums, val);
		System.out.println("Output: " + k); // Output: 2
		System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, k))); // Output: [2, 2]
	}

	 static int removeElement(int[] nums, int val) {
		 int j=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val) {
				nums[j]=nums[i];
				j++;
			}
		}
		return j;
	}
}
