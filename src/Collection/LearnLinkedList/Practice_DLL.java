package Collection.LearnLinkedList;

import Collection.LearnLinkedList.Practice_SLL.Node;

public class Practice_DLL {
	Node head;
	private int size;

	public Practice_DLL() {
		this.size = size;
	}

	class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {

			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
		size++;
	}

	public void insertLast(int value) {
		Node node = new Node(value);
		node.next = null;

		if (head == null) {
			node.prev = null;
			head = node;
			return;
		}

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = node;
		node.prev = last;
		size++;
	}

	public void insert(int value, int index) {
			if(index==0) {
				insertFirst(value);
				return;
			}
			if(index==size-1) {
				insertLast(value);
				return;
			}
			if (index < 0 || index > size) {
	            throw new IndexOutOfBoundsException("Invalid index");
	        }
			Node prevNode=get(index-1);
			Node node = new Node(value,prevNode.next,prevNode);
			if(node.next!=null) {
				node.next.prev=node;				
			}
			
			prevNode.next=node;
			size++;
	}

	public Node get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + "-->");
			temp = temp.next;
		}
		System.out.print("END" + " size : " + size);
		System.out.println();
	}

	public static void main(String[] args) {
		Practice_DLL list = new Practice_DLL();
		list.insertFirst(1);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.display();
		list.insertLast(10);
		list.display();
		list.insert(66,3);
		list.display();
//		list.deleteFirst();
//		list.display();
//		list.deleteLast();
//		list.delete(3);
//		list.display();
	}
}
