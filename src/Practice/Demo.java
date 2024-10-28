package Practice;

//1
//13
//135
//1357
//13579
public class Demo {
//	public static void main(String[] args) {
//		
//		for(int i=1;i<=6;i++) {
//			int n=1;
//			for(int j=1;j<i;j++) {
//				if(n%2 !=0) {
//					System.out.print(n);
//				}
//				n+=2;
//			}
//			
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
		

		int n=4;
		for(int i=0;i<n;i++){
			//print spaces
			for(int j=0;j<n-1-i;j++){
				System.out.print("_");
			}
			//print stars left 
			for(int j=n-i-1;j<n;j++) {
				System.out.print("*");
			}
			//print start right
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			//print spaces 
			for(int j=0;j<n-i-1;j++) {
				System.out.print("_");
			}
			System.out.println();

		}
		
	}
}
