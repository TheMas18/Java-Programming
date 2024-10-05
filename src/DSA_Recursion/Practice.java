package DSA_Recursion;

import java.util.ArrayList;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		int[] arr = { 1, 18, 4, 5, 18, 2, 18, 3, 12 };
		int target = 18;
		System.out.println(findAllIndex(arr, 0, target));
	}

	static ArrayList<Integer> findAllIndex(int a[], int i, int target) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (i == a.length) {
			return list;
		}
		if (a[i] == target) {
			list.add(i);
		}
		ArrayList<Integer> ansFromBelowCalls = findAllIndex(a, i + 1, target);
		list.addAll(ansFromBelowCalls);
		return list;
	}
}
