package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class T1 {
	public static void main(String[] args) {
		int n = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<Integer>());
		}

		adj.get(0).add(1);
		adj.get(0).add(4);
		adj.get(1).add(2);
		adj.get(1).add(3);
		adj.get(1).add(0);
		adj.get(4).add(0);
		adj.get(3).add(1);
		adj.get(2).add(1);

		T1 sl = new T1();
		ArrayList<Integer> ans = sl.bfsOfGraph(5, adj);
		int n2 = ans.size();
		for (int i = 0; i < n2; i++) {
			System.out.print(ans.get(i) + " ");
		}
	}

	private ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean vis[] = new boolean[v];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		vis[0] = true;
		while (!queue.isEmpty()) {
			Integer node = queue.poll();
			list.add(node);
			for (Integer it : adj.get(node)) {
				if (!vis[it]) {
					vis[it] = true;
					queue.add(it);
				}

			}
		}

		return list;
	}
}
