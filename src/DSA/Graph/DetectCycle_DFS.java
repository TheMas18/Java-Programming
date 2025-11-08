package DSA.Graph;

import java.util.ArrayList;
//undirected
public class DetectCycle_DFS {
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

	public static boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean vis[]) {
		vis[node] = true;
		for (Integer it : adj.get(node)) {
			if (!vis[it]) {
				if (dfs(it, node, adj, vis))
					return true;
			} else if (it != parent)
				return true;
		}
		return false;
	}

	public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
		int v = adj.size();
		boolean vis[] = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (vis[i] == false)
				if (dfs(i, -1, adj, vis))
					return true;
		}
		return false;
	}
}
