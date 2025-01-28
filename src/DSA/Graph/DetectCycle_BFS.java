package DSA.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node {
	int first;
	int second;

	public Node(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

}

public class DetectCycle_BFS {

	public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
		int v = adj.size();
		boolean vis[] = new boolean[v];
//		int[] parent = new int[v];
//		Arrays.fill(parent, -1);
		for (int i = 0; i < v; i++) {
			if (vis[i] == false) {
				if (checkCycle(adj, vis, i))
					return true;
			}
		}
		return false;
	}

	private static boolean checkCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int s) {
		// BFS
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(s, -1));
		vis[s] = true;

		while (!queue.isEmpty()) {
			int node = queue.peek().first;
			int par = queue.peek().second;
			queue.remove();
			for (Integer it : adj.get(node)) {
				if (vis[it] == false) {
					queue.add(new Node(it, node));
					vis[it] = true;
				} else if (par != it) {
					return true;
				}
			}

		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(1).add(2);
		adj.get(2).add(1);
		adj.get(2).add(3);
		adj.get(3).add(2);

		boolean ans = isCycle(adj);
		if (ans)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
