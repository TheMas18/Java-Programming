package Collection.LearnLinkedList;

import Collection.LearnLinkedList.InternalLinkedList.Node;

public class InternalDoublyLinkedList {
	Node head;

	public void display() {
		Node node = head;
		Node tail = null;
		while (node != null) {
			System.out.print(node.value + " -> ");
			tail = node;
			node = node.next;
		}
		System.out.println("END");
		System.out.println("Print in reverse");
		while (tail != null) {
			System.out.print(tail.value + " -> ");
			tail = tail.prev;

		}
		System.out.println("START");
	}

	public void inserFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
	}

	private class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}
	public static void main(String[] args) {
		InternalDoublyLinkedList list=new InternalDoublyLinkedList();
		list.inserFirst(1);
		list.inserFirst(2);
		list.inserFirst(4);
		list.inserFirst(11);
		list.inserFirst(14);
		list.display();
	}
}
