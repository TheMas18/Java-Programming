package DSA_Tree;

import DSA_Tree.Practice.Node;

public class AVL {

	public AVL() {

	}

	public class Node {
		int value;
		Node left;
		Node right;
		int height;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}

	}

	private Node root;

	public int height(Node node) {
		if (node == null) {
			return -1;
		}
		return node.height;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	public Node insert(Node node, int value) {
		if (node == null) {
			node = new Node(value);
			return node;
		}

		if (value < node.value) {
			node.left = insert(node.left, value);
		}
		if (value > node.value) {
			node.right = insert(node.right, value);
		}
		node.height = Math.max(height(node.left), height(node.right) + 1);
		return rotate(node);
	}

	public Node rotate(Node node) {
		// left heavy
		if (height(node.left) - height(node.right) > 1) {
			// left-left
			if (height(node.left) - height(node.right) > 0) {
				return rightRotate(node);
			}
			// left-right
			if (height(node.left) - height(node.right) < 0) {
				node.left = leftRotate(node.left);
				return rightRotate(node);
			}

		}

		// right heavy
		if (height(node.left) - height(node.right) < -1) {
			// right-right
			if (height(node.left) - height(node.right) < 0) {
				return leftRotate(node);
			}
			// right-left
			if (height(node.left) - height(node.right) > 0) {
				node.right = rightRotate(node.right);
				return leftRotate(node);
			}

		}
		return node;

	}

	public Node rightRotate(Node p) {

		Node c = p.left;
		Node t = c.right;

		c.right = p;
		p.left = t;

		p.height = Math.max(height(p.left), height(p.right) + 1);
		c.height = Math.max(height(c.left), height(c.right) + 1);

		return c;
	}

	public Node leftRotate(Node c) {
		Node p = c.right;
		Node t = p.left;

		p.left = c;
		c.right = t;

		p.height = Math.max(height(p.left), height(p.right) + 1);
		c.height = Math.max(height(c.left), height(c.right) + 1);

		return p;
	}

	public boolean balanced() {
		return balanced(root);
	}

	public boolean balanced(Node node) {
		if (node == null) {
			return true;
		}

		return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
	}

	public void display() {
		display(this.root, "Root Node :");
	}

	private void display(Node node, String details) {
		if (node == null) {
			return;
		}
		System.out.println(details + node.value);
		display(node.left, "Left child of " + node.value + ":");
		display(node.right, "Right child of " + node.value + ":");
	}

	public void populate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			this.insert(nums[i]);
		}
	}

}
