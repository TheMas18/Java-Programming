package Practice;

import java.util.HashMap;

//abstract class Animal{
//	Animal(){
//		
//	}
//}

public class P8 {
//	public static void main(String[] args) {
//		String s="Mayuresh";
//		String s1=helper(s);
//		System.out.println(s);
//		System.out.println("After reverse");
//		System.out.println(s1);
//	
//	}
//	
//	static String helper(String s) {
//		StringBuilder sb=new StringBuilder();
//		reverse(s,sb);
//		return sb.toString();
//	}
//	
//	static String reverse(String s ,StringBuilder sb) {
//		
//		if(s.length()==0) {
//			return s;
//		}
//		
//		
//		sb.append(s.charAt(s.length()-1));
//		reverse(s.substring(0,s.length()-1),sb);
//		return sb.toString();
	
	int a=10;
	public static void main(String[] args) {
		int a=20;
		P8 obj=new P8();
		obj.getA(a);
	}
	public void getA(int a) {
		this.a=a;
		System.out.println(a);
	}
//	}

}
