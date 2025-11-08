package DSA.LearnStack;

import java.util.Stack;

public class InfixToPrefix {

	// Driver code
	public static void main(String[] args) {
		String infix = "(A+B)*(C-D)";
		String prefix = infixToPrefix(infix);
		System.out.println("Infix: " + infix);
		System.out.println("Prefix: " + prefix);
	}

	static int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3; // Higher precedence for exponentiation
		}
		return -1; // Invalid operator
	}

	// Function to check if a character is an operator
	static boolean isOperator(char ch) {
		return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
	}

	// Function to reverse a string
	static String reverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

	// Function to convert infix expression to prefix
	static String infixToPrefix(String infix) {
		// Step 1: Reverse the infix expression
		String reversed = reverse(infix);

		// Step 2: Swap '(' with ')' and vice versa
		StringBuilder swapped = new StringBuilder();
		for (char ch : reversed.toCharArray()) {
			if (ch == '(') {
				swapped.append(')');
			} else if (ch == ')') {
				swapped.append('(');
			} else {
				swapped.append(ch);
			}
		}

		// Step 3: Convert the swapped infix expression to postfix
		String postfix = infixToPostfix(swapped.toString());

		// Step 4: Reverse the postfix expression to get prefix
		return reverse(postfix);
	}

	// Function to convert infix to postfix using a stack
	static String infixToPostfix(String infix) {
		Stack<Character> stack = new Stack<>();
		StringBuilder postfix = new StringBuilder();

		for (char ch : infix.toCharArray()) {
			if (Character.isLetterOrDigit(ch)) {
				// If the character is an operand, add it to the result
				postfix.append(ch);
			} else if (ch == '(') {
				// If '(', push to stack
				stack.push(ch);
			} else if (ch == ')') {
				// If ')', pop and add to postfix until '(' is found
				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}
				stack.pop(); // Remove '('
			} else if (isOperator(ch)) {
				// If operator, pop from stack while stack top has higher precedence
				while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
					postfix.append(stack.pop());
				}
				stack.push(ch);
			}
		}

		// Pop all remaining operators from stack
		while (!stack.isEmpty()) {
			postfix.append(stack.pop());
		}

		return postfix.toString();
	}

}
