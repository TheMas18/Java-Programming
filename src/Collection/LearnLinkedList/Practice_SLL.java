package Collection.LearnLinkedList;

public class Practice_SLL {
	Node head;
	Node tail;

	private int size;

	public Practice_SLL() {
		this.size=0;
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

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void insertLast(int value) {
		if (tail == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);

		tail.next = node;
		tail = node;
		size++;
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

	public int deleteFirst() {
		int val=head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}
	
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		
		Node secondLast=get(size-2);
		int value=secondLast.value;
		tail=secondLast;
		tail.next=null;
		size--;
		return value;
		
	}
	public int delete(int index) {
		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteLast();
		}
		
		Node prevNode=get(index-1);
		int value=prevNode.next.value;
		prevNode.next=prevNode.next.next;
		size--;
		return value;
	}
	
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
			
		}
		return node;
	}
	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + "-->");
			temp = temp.next;
		}
		System.out.print("END" + " size : "+ size);
		System.out.println();
	}

	public static void main(String[] args) {
		Practice_SLL list = new Practice_SLL();
		list.insertFirst(1);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.display();
		list.insertLast(10);
		list.display();
		list.insert(66,3);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
//		list.delete(3);
		list.display();
		
		
	}

}
