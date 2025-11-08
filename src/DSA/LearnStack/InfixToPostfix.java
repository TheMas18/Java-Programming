package DSA.LearnStack;

import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		String infixExpression = "A+B*(C^D-C)";
		String postfixExpression = infixToPostfix(infixExpression);

		System.out.println("Infix: " + infixExpression);
		System.out.println("Postfix: " + postfixExpression);
	}

	// Method to return precedence of operators
	public static int precedence(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3; // Exponent has the highest precedence
		}
		return -1;
	}

	// Method to convert infix to postfix
	public static String infixToPostfix(String expression) {
		StringBuilder result = new StringBuilder(); // To store postfix expression
		Stack<Character> stack = new Stack<>(); // Stack to hold operators

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			// If the character is an operand (A-Z, a-z, 0-9), add it to output
			if (Character.isLetterOrDigit(ch)) {
				result.append(ch);
			}
			// If the character is '(', push it to stack
			else if (ch == '(') {
				stack.push(ch);
			}
			// If the character is ')', pop from stack until '(' is encountered
			else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result.append(stack.pop());
				}
				stack.pop(); // Remove '('
			}
			// If the character is an operator
			else {
				while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
					result.append(stack.pop());
				}
				stack.push(ch);
			}
		}

		// Pop all remaining operators from the stack
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}

		return result.toString();
	}

}
