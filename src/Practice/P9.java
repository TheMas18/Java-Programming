package Practice;

public class P9 {

	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 10 }, { 3 }, { 7, 8 }, { 11, 5 } };
		int r = Integer.MIN_VALUE;
		for (int[] n : arr) {
			int newV = findMax(n);
			if (newV > r) {
				r = newV;
			}
		}
		System.out.println(r);
	}
}