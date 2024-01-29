package Collection.LearnLinkedList;


public class ReverseLinkedList {
	Node head;
	private int size;
	ReverseLinkedList(){
		this.size=0;
	}
	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// add first,last

	// add first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;

	}

	// how to print

	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -->");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}

	// delete first ,last
	// delete first

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;

	}
	// delete last

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondLast=head;
		Node lastNode=head.next;
		while(lastNode.next !=null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}

	public int getSize() {
		return size;
	}
	public void reverseIterate() {
		if (head == null || head.next == null) {
			return;
		}
		Node prevNode = head;
		Node currNode = head.next;

		while (currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			// update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;

	}
	
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.addLast("4");
		list.addFirst("3");		
		list.addFirst("2");
		list.addFirst("1");
	
		list.printList();
		list.reverseIterate();
		list.printList();	}
}
