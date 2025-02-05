package DSA.Graph;

import java.util.ArrayList;

public class GraphRepresentation_List {
	public static void main(String[] args) {

		int n = 3;
		int m = 3;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			adj.add(new ArrayList<Integer>());
		}
		// edge 1--2
		adj.get(1).add(2);
		adj.get(2).add(1);

		// edge 2--3
		adj.get(2).add(3);
		adj.get(3).add(2);

		// print all nodes;

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
