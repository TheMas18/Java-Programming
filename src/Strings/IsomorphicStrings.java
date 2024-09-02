package Strings;

import java.util.HashMap;

//pijthbsfy
//fvladzpbf
public class IsomorphicStrings {
	public static boolean areIsomorphic(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {

			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);

			if (map1.containsKey(c1)) {

				if (map1.get(c1) != c2) {
					return false;
				}

			} else {
				map1.put(c1, c2);
			}

			if (map2.containsKey(c2)) {

				if (map2.get(c2) != c1) {
					return false;
				}

			} else {
				map2.put(c2, c1);
			}

		}
		
		return true;

	}

	public static void main(String[] args) {
		// Test cases
		String str1 = "foo";
		String str2 = "bar";
		System.out.println(areIsomorphic(str1, str2)); // Output: false

		str1 = "paper";
		str2 = "title";
		System.out.println(areIsomorphic(str1, str2)); // Output: true

		str1 = "add";
		str2 = "egg";
		System.out.println(areIsomorphic(str1, str2)); // Output: true
	}
}
