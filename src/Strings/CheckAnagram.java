package Strings;

import java.util.Arrays;
//without inbuilt methods
public class CheckAnagram {

	public static void bubbleSortCustom(char[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					char temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}

			}
			if (!swapped) {
				break;
			}
		}

	}

	public static char[] toCharArrayCustom(String s) {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "aet";
		if (s1.length() == s2.length()) {
			char c1[] = toCharArrayCustom(s1);
			char c2[] = toCharArrayCustom(s2);

			bubbleSortCustom(c1);
			bubbleSortCustom(c2);

			if (Arrays.equals(c1, c2)) {
				System.out.println("Anagram String");
			} else {
				System.out.println("Not An Anagram String");
			}
		} else {
			System.out.println("Not An Anagram String");
		}
	}
}
