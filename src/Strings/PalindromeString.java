package Strings;

public class PalindromeString {
	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for (int i = s.length()-1; i >=0; i--) {
			rev =rev+ s.charAt(i);
		}
		
		if (rev.equalsIgnoreCase(s)) {
			System.out.println("Given String is a Palindrome String");
		} else {
			System.out.println("Given String is not an Palindrome String");
		}
	}
}
