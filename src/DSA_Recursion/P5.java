package DSA_Recursion;

import java.util.ArrayList;

//Permutations
public class P5 {

	//Print all the permutations of the string
	public static void main(String[] args) {
		String s="abc";
		permutations("",s);
		System.out.println();
		System.out.println("Using List");
		ArrayList<String> list=permutationsList("",s);
		list.stream().forEach((item)->System.out.print(item +" "));
		System.out.println();
		System.out.println("Count of Permutations : " + permutationsCount("", s));
		
	}

	private static void permutations(String p, String up) {
		if(up.isEmpty()) {
			System.out.print(p +" ");
			return;
		}
		
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			permutations(f+ ch + s, up.substring(1));
		}
	}

	//using List
	
	private static ArrayList<String> permutationsList(String p, String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		ArrayList<String> ans =new ArrayList<String>();
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			ans.addAll(permutationsList(f+ ch + s, up.substring(1)));
		}
		return ans;
	}
	
	//count the permutations
	
	private static int permutationsCount(String p, String up) {
		if(up.isEmpty()) {
			return 1;
		}
		int count=0;
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++) {
			String f=p.substring(0,i);
			String s=p.substring(i,p.length());
			count=count+permutationsCount(f+ ch + s, up.substring(1));
		}
		return count;
	}

}
