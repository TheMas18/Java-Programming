package DSA_Recursion;

public class P3 {
/*
 * 	****
 * 	***
 * 	**
 *  *
 * 
 */
//	public static void main(String[] args) {
//		print(4,0);
//	}
//	static void print(int row,int col) {
//		if(row==0) {
//			return;
//		}
//		if(col<row) {
//			System.out.print("*");
//			print(row,col+1);
//		}else {
//			System.out.println();
//			print(row-1,0);
//		}
//		
//	}
	
	
	
	public static void main(String[] args) {
		print(4,0);
	}
	static void print(int row,int col) {
		if(row==0) {
			return;
		}
		if(col<row) {
			print(row,col+1);
			System.out.print("*");
		}else {
			print(row-1,0);
			System.out.println();
		}
		
	}
}
