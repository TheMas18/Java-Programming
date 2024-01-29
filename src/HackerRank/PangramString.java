package HackerRank;

import java.math.*;
import java.util.*;

public class PangramString {
	public static String pangrams(String s) {
		s = s.toLowerCase();
		boolean[] b = new boolean[26];

		for (int i = 0; i < s.length(); i++) {// w
			char currentChar = s.charAt(i);
			if (currentChar >= 'a' && currentChar <= 'z') {
				int index = currentChar - 'a';
				b[index] = true;
			}

		}

		for (boolean b1 : b) {
			if (!b1) {
				return "not pangram";
			}
		}
		return "pangram";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		if (s.length() > 0 && s.length() <= Math.pow(10, 3)) {
			System.out.println(pangrams(s));
		}

	}
}

/*
 * Q A pangram is a string that contains every letter of the alphabet. Given a
 * sentence determine whether it is a pangram in the English alphabet. Ignore
 * case. Return either pangram or not pangram as appropriate.
 * 
 * Example
 * 
 * The string contains all letters in the English alphabet, so return pangram.
 * 
 * Function Description
 * 
 * Complete the function pangrams in the editor below. It should return the
 * string pangram if the input string is a pangram. Otherwise, it should return
 * not pangram.
 * 
 * pangrams has the following parameter(s):
 * 
 * string s: a string to test Returns
 * 
 * string: either pangram or not pangram Input Format
 * 
 * A single line with string .
 * 
 * Constraints
 * 
 * 
 * Each character of ,
 * 
 * Sample Input
 * 
 * Sample Input 0
 * 
 * We promptly judged antique ivory buckles for the next prize
 * 
 * Sample Output 0
 * 
 * pangram
 * 
 * Sample Explanation 0
 * 
 * All of the letters of the alphabet are present in the string.
 * 
 * Sample Input 1
 * 
 * We promptly judged antique ivory buckles for the prize
 * 
 * Sample Output 1
 * 
 * not pangram
 * 
 * Sample Explanation 0
 * 
 * The string lacks an x.
 */
