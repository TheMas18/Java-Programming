package Collection.LearnLinkedList;

public class InternalLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public InternalLinkedList() {
		this.size = 0;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size += 1;
	}

	public void insertLast(int value) {
		if (tail == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size += 1;
	}

	public void insert(int value, int index) {
		if (index == 0) {
			insertFirst(value);
			return;
		}
		if (index == size) {
			insertLast(value);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;

	}

	public int delete(int index) {
		if (index == 0) {
			return deleteFirst();
		}
		if (index == size - 1) {
			return deleteLast();
		}
		Node prevNode = get(index - 1);
		int value = prevNode.next.data;
		prevNode.next = prevNode.next.next;
		size--;
		return value;

	}

	public int deleteFirst() {
		int val = head.data;
		if (head == null) {
			tail = null;
		}
		head = head.next;
		size--;
		return val;
	}

	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}
		Node secondLastNode = get(size - 2);
		int value = tail.data;
		tail = secondLastNode;
		tail.next = null;
		return value;
	}

	public Node get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	public static void main(String[] args) {
		InternalLinkedList list = new InternalLinkedList();
		list.insertFirst(1);
		list.insertFirst(5);
		list.insertFirst(7);
		list.insertLast(11);

		list.display();
	}
}
