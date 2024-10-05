package DSA.LearnStack;

import java.util.Stack;

public class ImplementQueueUsingStack {

	private Stack<Integer> first;
	private Stack<Integer> second;

	public ImplementQueueUsingStack() {

		first = new Stack<>();
		second = new Stack<>();
	}

	// O(1)
//	public void push(int x) {
//		first.push(x);
//	}
	// O(N)
//	public int pop() throws Exception {
//		while (!first.isEmpty()) {
//			second.push(first.pop());
//		}
//		int removed = second.pop();
//		while (!second.isEmpty()) {
//			first.push(second.pop());
//		}
//
//		return removed;
//
//	}

//	public int peek() throws Exception {
//		while (!first.isEmpty()) {
//			second.push(first.pop());
//		}
//		int peeked = second.peek();
//		while (!second.isEmpty()) {
//			first.push(second.pop());
//		}
//
//		return peeked;
//	}
	// O(N)
	public void push(int x) {
		while (!first.isEmpty()) {
			second.push(first.pop());
		}
		first.push(x);
		while (!second.isEmpty()) {
			first.push(second.pop());
		}
	}

	// O(1)
	public int pop() throws Exception {
		return first.pop();
	}

	public int peek() throws Exception {

		return first.peek();
	}

	public boolean empty() {
		return first.isEmpty();
	}
}