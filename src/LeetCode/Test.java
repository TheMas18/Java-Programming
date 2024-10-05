package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

//Return the index of smallest number >= target
public class Test {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
		System.out.println("index : " + binarySearch(nums, 15) + "  Number : " + nums[binarySearch(nums, 15)]);
		
	

	}

	public static int binarySearch(int[] nums, int search) {
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (search < nums[mid]) {
				end = mid - 1;
			} else if (search > nums[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}
		return start;

	}

}
