package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class StrP5 {

//Reverse String
	/*
	 * Given a string, the task is to reverse the order of the words in the given
	 * string. Input: s = “geeks quiz practice code” Output: s = “code practice quiz
	 * geeks”
	 */

	/*
	 * public static String reverse(String[] str) { StringBuilder sb = new
	 * StringBuilder();
	 * 
	 * for (int i = str.length - 1; i >= 0; i--) { sb.append(str[i]); if (i != 0) {
	 * sb.append(" "); } } return new String(sb); }
	 * 
	 * public static void main(String[] args) { String s =
	 * "geeks quiz practice code"; String split[] = s.split(" "); String result =
	 * reverse(split); System.out.println(result); }
	 */

	/*
	 * Longest Common Prefix using Sorting Last Updated : 13 Apr, 2024 Problem
	 * Statement: Given a set of strings, find the longest common prefix. Examples:
	 * 
	 * Input: {“geeksforgeeks”, “geeks”, “geek”, “geezer”} Output: “gee”
	 * 
	 * Input: {“apple”, “ape”, “april”} Output: “ap”
	 */

	/*
	 * public static void main(String[] args) { String[] input1 = { "geeksforgeeks",
	 * "geeks", "geek", "geezer" }; String[] input2 = { "apple", "ape", "april" };
	 * System.out.println("The longest Common Prefix is: " +
	 * findLongestCommonPrefix(input1));
	 * System.out.println("The longest Common Prefix is: " +
	 * findLongestCommonPrefix(input2)); }
	 * 
	 * public static String findLongestCommonPrefix(String[] strs) { if (strs ==
	 * null || strs.length == 0) { return ""; } Arrays.sort(strs); String first =
	 * strs[0]; String last = strs[strs.length - 1]; int minLength =
	 * Math.min(first.length(), last.length()); int i = 0; while (i < minLength &&
	 * first.charAt(i) == last.charAt(i)) { i++; } return first.substring(0, i); }
	 */

	/*
	 * Converting Roman Numerals to Integer Last Updated : 20 May, 2024 Given a
	 * string in roman form, the task is to convert this given roman string into an
	 * integer.
	 * 
	 * Roman numerals are based on the following symbols:
	 * 
	 * Symbol
	 * 
	 * Value
	 * 
	 * I
	 * 
	 * 1
	 * 
	 * V
	 * 
	 * 5
	 * 
	 * X
	 * 
	 * 10
	 * 
	 * L
	 * 
	 * 50
	 * 
	 * C
	 * 
	 * 100
	 * 
	 * D
	 * 
	 * 500
	 * 
	 * M
	 * 
	 * 1000
	 * 
	 * Example:
	 * 
	 * Input: IX Output: 9 Explanation: IX is a Roman symbol which represents 9
	 * 
	 * Input: XL Output: 40 Explanation: XL is a Roman symbol which represents 40
	 * 
	 * Input: MCMIV Output: 1904 Explanation: M is a thousand, CM is nine hundred
	 * and IV is four
	 */

//	public static void main(String[] args) {
//
//		String roman3 = "MCMIV";
//
//		System.out.println(romanToInt(roman3));
//	}
//
//	public static int romanToInt(String s) {
//		int total=0;
//		Map<Character, Integer> romanValues = new HashMap();
//		romanValues.put('I', 1);
//		romanValues.put('V', 5);
//		romanValues.put('X', 10);
//		romanValues.put('L', 50);
//		romanValues.put('C', 100);
//		romanValues.put('D', 500);
//		romanValues.put('M', 1000);//2151
//		
//		char c[]=s.toCharArray();//MCMIV // MCMI
//		for(int i=0;i<c.length-1;i++) {//0123<4
//			//
//				if(romanValues.get(c[i])>romanValues.get(c[i+1])) {
//					total=total+romanValues.get(c[i]);//1899
//				}else {
//					total=total-romanValues.get(c[i]);//
//				}
//		
//		}
//		total=total+romanValues.get(c[c.length-1]);
//		return total;
//	}

//	public static void main(String[] args) {
//
//		int n = 3549;
//
//		String r = intToRoman(n);
//		System.out.println(r);
//	}
//
//	public static String intToRoman(int n) {
//		StringBuilder sb=new StringBuilder();
//		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
//		// Corresponding values of the symbols
//		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
//		
//		for (int i = 0; i < values.length; i++) {
//			while(n>=values[i]) {
//				n=n-values[i];
//				sb.append(symbols[i]);
//			}
//		}
//		
//		
//		
//		return sb.toString();
//	};

//	Find the minimum distance between the given two words
//	Last Updated : 12 Jul, 2023
//	Given a list of words followed by two words, the task is to find the minimum distance between the given two words in the list of words.
//
//	Examples:
//
//	Input: S = { “the”, “quick”, “brown”, “fox”, “quick”}, word1 = “the”, word2 = “fox”
//	Output: 3
//	Explanation: Minimum distance between the words “the” and “fox” is 3
//
//	Input: S = {“geeks”, “for”, “geeks”, “contribute”,  “practice”}, word1 = “geeks”, word2 = “practice”
//	Output: 2
//	Explanation: Minimum distance between the words “geeks” and “practice” is 2

//	public static int calculateDistance(String s[], String s1, String s2) {
//		int total = Integer.MAX_VALUE;
//		int index1=-1;//1
//		int index2=-1;//0
//		
//		for(int i=0;i<s.length;i++) {//01234
//			if(s1.equals(s[i])) {
//				index1=i;
//			}
//			if(s2.equals(s[i])) {
//				index2=i;
//			}
//			if(index1 != -1 && index2 != -1) {
//				
//				total=Math.min(total, Math.abs(index1-index2));
//			}
//		}
//		return total;
//	}
//
//	public static void main(String[] args) {
//		String[] str = {"the","c","c","mas", "the","brown", "mas", "fox","the", "quick","A","B","mas" };
//		String s1 = "the";
//		String s2 = "mas";
//		System.out.println(calculateDistance(str, s1, s2));
//	}
	
//	
//Q Find an equal point in a string of brackets
//	Last Updated : 19 Sep, 2023
//	Given a string of brackets, the task is to find an index k which decides the number of opening brackets is equal to the number of closing brackets. 
//	The string must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.
//
//	An equal point is an index such that the number of opening brackets before it is equalp90s to the number of closing brackets from and after.
//
//	Examples:  
//
//	Input: str = “(())))(“
//	Output:   4
//	Explanation: After index 4, string splits into (()) and ))(. The number of opening brackets in the first part is equal to the number of closing brackets in the second part.
//
//	Input: str = “))”
//	Output: 2
//	Explanation: As after 2nd position i.e. )) and “empty” string will be split into these two parts. So, in this number of opening brackets i.e. 0 in the first part is equal to the number of closing brackets in the second part i.e. also 0.
//

//	public static int findIndex(String num) {
//		
//		int count_close=0;
//		for(int i=0;i<num.length();i++) {
//			if(num.charAt(i)==')') {
//				count_close++;
//			}
//		}
//		int count_open=0;
//		for (int i = 0; i <num.length(); i++) {
//			if(num.charAt(i)=='(') {
//				count_open++;
//			}else {
//				count_close--;
//			}
//			
//			if(count_close==count_open) {
//				return i+1;
//			}
//		}
//		return -1;
//	}
//
//	public static void main(String[] args) {
//		String str = "(()))(()()())))";
//		System.out.println(findIndex(str));
//	}
	public static void main(String[] args) {
		print(5);
	}
	static int print(int n) {
		System.out.println(n);
		if(n==1) {
			System.out.println("done");
			return n;
		}
		return print(n-1);
	}
	
	
	
}
