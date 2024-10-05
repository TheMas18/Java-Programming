package DSA.LearnStack;

import java.util.Iterator;

public class CustomStack {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;

	int ptr = -1;

	CustomStack() {
		this(DEFAULT_SIZE);
	}

	CustomStack(int size) {
		this.data = new int[size];
	}

	public boolean isFull() {
		return ptr == data.length - 1;
	}

	public boolean isEmpty() {
		return ptr == -1;
	}

	// push

	public boolean push(int item) {
		if (isFull()) {
			System.out.println("Stack is full");
			return false;
		}

		ptr++;
		data[ptr] = item;
		return true;
	}

	// pop

	public int pop() throws StackException {
		if (isEmpty()) {
			throw new StackException("Stack is Empty");
		}

		return data[ptr--];
	}

	// peek

	public int peek() throws StackException {
		if (isEmpty()) {
			throw new StackException("Stack is Empty");
		}

		return data[ptr];
	}

	// display
	public void display() {
		for (int i = 0; i <= ptr; i++) {
			System.out.println(data[i]);
		}
	}
}
