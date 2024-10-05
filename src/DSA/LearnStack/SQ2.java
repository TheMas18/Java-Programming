package DSA.LearnStack;

import java.util.Scanner;
import java.util.Stack;
//()[]
public class SQ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		 if(isValid(s)==true) {
			 System.out.println("String is valid");
		 }else {
			 System.out.println("String is not valid");
		 }
	}

	public static boolean isValid(String s) {//)
		Stack<Character> sr = new Stack<Character>();//(
		for (char c : s.toCharArray()) {//(
			if (c == '(' || c == '{' || c == '[') {

				sr.push(c);
			} else if (sr.isEmpty() || !isMatching(sr.pop(), c)) {//false|| false
				return false;
			}
		}

		return sr.isEmpty();

	}

	public static boolean isMatching(char open, char close) {
		// TODO Auto-generated method stub
		return ((open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']'));

	}
}
