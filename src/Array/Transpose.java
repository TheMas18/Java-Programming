package Array;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
	
		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[j][i]);
//			}
//			System.out.println();
//		}
//		
		
//		int sum=0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				if(i==j) {
//					sum=sum+a[i][j];
//				System.out.print(a[i][j]);
//				}
//				else {
//					System.out.print("_");
//				}
//				
//			}
//			System.out.println();
//		}
//		System.out.println(sum);
		
		
		
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				if (i + j == 2) {
//					sum = sum + a[i][j];
//					System.out.print(a[i][j]);
//				} else {
//					System.out.print("_");
//
//				}
//			}
//			System.out.println();
//		}
//		System.out.println(sum);
	}
}
