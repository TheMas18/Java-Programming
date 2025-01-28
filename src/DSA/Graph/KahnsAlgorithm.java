package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnsAlgorithm {
	public static void main(String[] args) {
		int V = 6;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		adj.get(2).add(3);
		adj.get(3).add(1);
		adj.get(4).add(0);
		adj.get(4).add(1);
		adj.get(5).add(0);
		adj.get(5).add(2);

		ArrayList<Integer> topologicalSort = topologicalSort(adj);
		for (int node : topologicalSort) {
			System.out.print(node + " ");
		}
		System.out.println("");
	}

	static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
		int v = adj.size();
		int indegree[] = new int[v];

		for (int i = 0; i < v; i++) {
			for (Integer it : adj.get(i)) {
				indegree[it]++;
			}
		}

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < indegree.length; i++) {
			if (indegree[i] == 0) {
				queue.add(i);
			}
		}

		ArrayList<Integer> result = new ArrayList<>();
		while (!queue.isEmpty()) {
			int node = queue.peek();
			result.add(node);
			queue.remove();
			for (Integer it : adj.get(node)) {
				indegree[it]--;
				if (indegree[it] == 0) {
					queue.add(it);
				}
			}

		}
		return result;

	}

}
