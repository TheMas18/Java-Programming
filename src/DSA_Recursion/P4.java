package DSA_Recursion;

import java.util.ArrayList;

public class P4 {
//Q1 Skip a character in the string

// "bcaadh" = skip a : o/p: bcdh;
	
//	static void skip(String p,String up) {
//		if(up.isEmpty()) {
//			System.out.println(p);
//			return;
//		}
//		char ch=up.charAt(0);
//		if(ch=='a') {
//			skip(p,up.substring(1));
//		}else {
//			skip(p+ch,up.substring(1));
//		}
//	}
//	public static void main(String[] args) {
//		skip("","bcaadh");
//	}
	//with return type 
	
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
	
	//Skip the word apple
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
	//we can use list here like this ,
	
	static ArrayList<String> subSeq(String p, String up) {
		ArrayList<String> list=new ArrayList<String>();
		if(up.isEmpty()) {
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> left=subSeq(p, up.substring(1));
		ArrayList<String> right=subSeq(p+ch, up.substring(1));
		
		left.addAll(right);
		return left;
	}
	public static void main(String[] args) {
		System.out.println(subSeq("","abc"));
	}
}
