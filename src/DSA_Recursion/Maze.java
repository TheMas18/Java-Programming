package DSA_Recursion;

import java.util.ArrayList;

public class Maze {
	public static void main(String[] args) {
		// 1
		// System.out.println(count(3, 3));
		// 2
		// path("", 3, 3);
		// 3
		// System.out.println(pathList("", 3, 3));
		// 4
		// System.out.println(pathDiagonal("", 3, 3));
		// 5
		boolean[][] box = { 
				{ true, true, true }, 
				{ true, false, true }, 
				{ true, true, true }
		};
		pathWithRestriction("", box, 0, 0);
	}

	// 1 - count no of ways to reach the end
	private static int count(int r, int c) {
		if (r == 1 || c == 1) {
			return 1;
		}

		int left = count(r - 1, c);
		int right = count(r, c - 1);
		return left + right;

	}

	// 2 - print path
	private static void path(String p, int r, int c) {
		if (r == 1 && c == 1) {
			System.out.println(p);
			return;
		}
		if (r >= 0) {
			path(p + 'D', r - 1, c);
		}
		if (c >= 0) {
			path(p + 'R', r, c - 1);
		}

	}

	// 3 - add in arraylist
	private static ArrayList<String> pathList(String p, int r, int c) {
		if (r == 1 && c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if (r >= 0) {
			list.addAll(pathList(p + 'D', r - 1, c));
		}
		if (c >= 0) {
			list.addAll(pathList(p + 'R', r, c - 1));
		}
		return list;

	}

	// 4 - print path but also include diagonal path
	private static ArrayList<String> pathDiagonal(String p, int r, int c) {
		if (r == 1 && c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if (r >= 0 && c >= 0) {
			list.addAll(pathDiagonal(p + 'D', r - 1, c - 1));
		}
		if (r >= 0) {
			list.addAll(pathDiagonal(p + 'V', r - 1, c));
		}

		if (c >= 0) {
			list.addAll(pathDiagonal(p + 'H', r, c - 1));
		}
		return list;

	}

	// 5 - Maze with obstacle

	private static void pathWithRestriction(String p, boolean[][] maze, int r, int c) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		if (!maze[r][c]) {
			return;
		}

		if (r < maze.length - 1) {
			pathWithRestriction(p + 'D',maze, r + 1, c);
		}
		if (c < maze[0].length - 1) {
			pathWithRestriction(p + 'R',maze, r, c + 1);
		}

	}

}
