package Basic;

public class Factors {
	public static void main(String[] args) {
		int a=6;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
	}

}
