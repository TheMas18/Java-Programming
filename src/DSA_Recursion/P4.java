package DSA_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4 {
//Q1 Skip a character in the string

// "bcaadh" = skip a : o/p: bcdh;

//	static void skip(String p,String up) {//
//		if(up.isEmpty()) {
//			System.out.println(p);
//			return;
//		}
//		char ch=up.charAt(0);//a
//		if(ch=='a') {
//			skip(p,up.substring(1));//3  bc ||adh => 4 bc||dh
//		}else {
//			skip(p+ch,up.substring(1));//bcdh
//		}
//	}
//	public static void main(String[] args) {
//		skip("","bcaadh");
//	}
	// with return type

//	static String skip(String up) {
//		if(up.isEmpty()) {
//			return "";
//		}
//		char ch=up.charAt(0);
//		if(ch=='a') {
//			return skip(up.substring(1));
//		}else {
//			return ch+ skip(up.substring(1));
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println(skip("bcaadh"));
//	}

	// Skip the word apple
//	static String skip(String up) {
//		if(up.isEmpty()) {
//			return "";
//		}
//		if(up.startsWith("apple")) {
//			return skip(up.substring(5));
//		}else {
//			return up.charAt(0)+ skip(up.substring(1));
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println(skip("bcaappleadh"));
//	}

//Q create subsets of "abc"

//	static void subSeq(String p, String up) {
//		if(up.isEmpty()) {
//			System.out.print(p +" ");
//			return;
//		}
//		char ch=up.charAt(0);
//		subSeq(p, up.substring(1));
//		subSeq(p+ch, up.substring(1));
//	}
//	public static void main(String[] args) {
//		subSeq("","abc");
//	}

	// we can use list here like this ,

//	static ArrayList<String> subSeq(String p, String up) {
//		ArrayList<String> list=new ArrayList<String>();
//		if(up.isEmpty())
//		{
//			if(p!="") {
//				list.add(p);				
//			}
//			return list;
//		}
//		char ch=up.charAt(0);
//		ArrayList<String> left=subSeq(p, up.substring(1));
//		ArrayList<String> right=subSeq(p+ch, up.substring(1));
//		
//		left.addAll(right);
//		return left;
//	}
//	public static void main(String[] args) {
//		System.out.println(subSeq("","abc"));
//	}

	// Without Recursion
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3 };
//		List<List<Integer>> ans = subset(arr);
//		for (List<Integer> list : ans) {
//			System.out.println(list);
//		}
//	}
//
//	static List<List<Integer>> subset(int[] arr) {
//		List<List<Integer>> outer = new ArrayList<>();
//		outer.add(new ArrayList<>());
//		for (int num : arr) {
//			int n = outer.size();
//			for (int i = 0; i < n; i++) {
//				List<Integer> internal = new ArrayList<>(outer.get(i));
//				internal.add(num);
//				outer.add(internal);
//			}
//		}
//
//		return outer;
//	}

	// duplicates

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2 };
		List<List<Integer>> ans = subsetDuplicate(arr);
		for (List<Integer> list : ans) {
			System.out.println(list);
		}
	}

	static List<List<Integer>> subsetDuplicate(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			start = 0;
			// if current and previous element is same, s = e + 1
			if (i > 0 && arr[i] == arr[i - 1]) {
				start = end + 1;
			}
			end = outer.size() - 1;
			int n = outer.size();
			for (int j = start; j < n; j++) {
				List<Integer> internal = new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		return outer;
	}

}
