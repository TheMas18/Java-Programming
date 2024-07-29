package Collection.LearnLinkedList;

import java.util.LinkedList;

import Collection.LearnLinkedList.Practice_SLL.Node;

public class InternalCircularLinkedList {
	Node head;
	Node tail;

	private int size;

	public InternalCircularLinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	
	public void insert(int value) {
		Node node=new Node(value);
		
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		
		tail.next=node;
		node.next=head;
		tail=node;
		
	}
	
	
	
	class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public Node(int value) {
			this.value = value;
		}

	}
	
	public static void main(String[] args) {
		LinkedList<Integer> liss=new LinkedList<Integer>();

	}

}
