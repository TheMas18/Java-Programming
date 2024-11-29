package DSA_Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BackTracking {
	public static void main(String[] args) {
		boolean[][] box = { 
				{ true, true, true }, 
				{ true, true, true }, 
				{ true, true, true }
		};
//		path("", box, 0, 0);
		int [][]path=new int[box.length][box[0].length];
		allPathPrint("", box, 0, 0, path, 1);
	}
	
	//Print path
	private static void path(String p, boolean[][] maze, int r, int c) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		if (!maze[r][c]) {
			return;
		}
		maze[r][c]=false;
		if (r < maze.length - 1) {
			path(p + 'D', maze, r + 1, c);
		}
		if (c < maze[0].length - 1) {
			path(p + 'R', maze, r, c + 1);
		}
		if(r>0) {
			path(p + 'U', maze, r-1, c);
		}
		if(c>0) {
			path(p + 'L', maze, r, c-1);
		}
		maze[r][c]=true;
	}
	
	//print all paths with the matrix
	private static void allPathPrint(String p, boolean[][] maze, int r, int c ,int[][]path,int step) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			for(int []arr:path) {
				path[r][c]=step;
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		if (!maze[r][c]) {
			return;
		}
		maze[r][c]=false;
		path[r][c]=step;
		if (r < maze.length - 1) {
			allPathPrint(p + 'D', maze, r + 1, c,path,step+1);
		}
		if (c < maze[0].length - 1) {
			allPathPrint(p + 'R', maze, r, c + 1,path,step+1);
		}
		if(r>0) {
			allPathPrint(p + 'U', maze, r-1, c,path,step+1);
		}
		if(c>0) {
			allPathPrint(p + 'L', maze, r, c-1,path,step+1);
		}
		maze[r][c]=true;
		path[r][c]=0;
	}
}
