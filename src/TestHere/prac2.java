package TestHere;

import java.util.Arrays;

public class prac2 {
	public static int[] insertElement(int[] arr, int ele, int posi) {
		int temp[] = new int[arr.length + 1];
		for (int i = 0; i < temp.length; i++) {
			if (i < posi) {
				temp[i] = arr[i];
			}
			if (i == posi) {
				temp[posi] = ele;
			}
			if (i > posi) {
				temp[i] = arr[i - 1];
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(insertElement(array, 10, 2)));
	}
}
