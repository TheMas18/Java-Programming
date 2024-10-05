package DSA.LearnQueue;

public class CustomQueue {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
  
	int end = 0;

	CustomQueue() {
		this(DEFAULT_SIZE);
	}

	CustomQueue(int size) {
		this.data = new int[size];

	}

	public boolean isFull() {
		return end == data.length;
	}

	public boolean isEmpty() {
		return end == 0;
	}

	// Insert
	public boolean insert(int item) {
		if (isFull()) {
			System.out.println("Queue is full");
			return false;
		}

		data[end] = item;
		end++;
		return true;
	}

	// Remove

	public int remove() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue Is Empty");
		}

		int removedElement = data[0];

		for (int i = 1; i < end; i++) {
			data[i - 1] = data[i];
		}
		end--;
		return removedElement;
	}

	// Peek

	public int peek() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue Is Empty");
		}

		return data[0];
	}

	// display
	public void display() {
		for (int i = 0; i < end; i++) {
			System.out.println(data[i]);
		}
	}

}
